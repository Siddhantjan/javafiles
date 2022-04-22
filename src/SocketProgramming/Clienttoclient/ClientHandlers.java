package SocketProgramming.Clienttoclient;

import SocketProgramming.multiclient.ClientHandler;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandlers implements Runnable{
    public static ArrayList<ClientHandlers> clientHandlers= new ArrayList<>();
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    private String userName;
    public ClientHandlers(Socket socket) {
       try {
           this.socket=socket;
           this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
           this.bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
           this.userName=bufferedReader.readLine();
           clientHandlers.add(this);
           broadCaseMessage("Server : "+userName+" has entereed in Chat");
       }
       catch (IOException e){closedAll(socket,bufferedReader,bufferedWriter);}

    }

    private void closedAll(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        removeClientHandler();
        try {
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
            if(socket != null){
                socket.close();
            }

        }catch (IOException e){e.printStackTrace();}
    }

    private void broadCaseMessage(String messageToSend) {
        for (ClientHandlers clientHandler: clientHandlers){
            try {
                if(!clientHandler.userName.equals(userName)){
                    clientHandler.bufferedWriter.write(messageToSend);
                    clientHandler.bufferedWriter.newLine();
                    clientHandler.bufferedWriter.flush();
                }
            }catch (IOException e){
                closedAll(socket,bufferedReader,bufferedWriter);
            }
        }
    }

    @Override
    public void run() {
        String messageFromClient;
        while (socket.isConnected()){
            try {
                messageFromClient=bufferedReader.readLine();
                broadCaseMessage(messageFromClient);
            }
            catch (IOException e){
                closedAll(socket,bufferedReader,bufferedWriter);
                break;
            }
        }
    }
    public void removeClientHandler(){
        clientHandlers.remove(this);
        broadCaseMessage("Server : "+userName+" left the group");
    }
}
