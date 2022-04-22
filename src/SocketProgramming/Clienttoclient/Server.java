package SocketProgramming.Clienttoclient;

import SocketProgramming.multiclient.ClientHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    public void startServer() throws IOException {
        try {
            while (!serverSocket.isClosed()){
              Socket socket= serverSocket.accept();
                System.out.println("A new Client has connected");
                ClientHandlers clientHandlers= new ClientHandlers(socket);
                Thread thread = new Thread(clientHandlers);
                thread.start();
            }
        }catch (IOException e){serverSocket.close();}
    }
    public void closeServerSocketMethod() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(9996);
        Server server = new Server(serverSocket);
        server.startServer();

    }

}
