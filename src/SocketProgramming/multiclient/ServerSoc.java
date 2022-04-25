package SocketProgramming.multiclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9997);

        while (true) {
            Socket s = null;

            try
            {
                s = ss.accept();

                System.out.println("A new client is connected : " + s);

                System.out.println("Assigning new thread for this client");

                Thread t = new ClientHandler(s);

                t.start();

            }
            catch (Exception e){
                s.close();
                e.printStackTrace();
            }
        }
    }
}
