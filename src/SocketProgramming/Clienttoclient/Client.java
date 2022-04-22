package SocketProgramming.Clienttoclient;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String mUserName;

    public Client(Socket socket,String mUserName) {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.mUserName = mUserName;
        }
        catch (IOException e){closedAll(socket,bufferedReader,bufferedWriter);}
    }

    private void closedAll(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
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

    public void  sendMessage(){
        try {
            bufferedWriter.write(mUserName);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            Scanner sc = new Scanner(System.in);
            while (socket.isConnected()){
                String messageToSend = sc.nextLine();
                bufferedWriter.write(mUserName+": "+messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        }catch (IOException e){ closedAll(socket,bufferedReader,bufferedWriter);}
    }
    public void listeningMessages(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String messageFromChat;
                while (socket.isConnected()) {
                    try {
                        messageFromChat = bufferedReader.readLine();
                        System.out.println(messageFromChat);
                    } catch (IOException e) {
                        closedAll(socket, bufferedReader, bufferedWriter);
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please write a username to continue to chat");
        String name= sc.nextLine();
        String host = "localhost";
        int port = 9996;
        Socket socket = new Socket(host,port);
        Client client = new Client(socket,name);
        client.listeningMessages();
        client.sendMessage();
    }
}
