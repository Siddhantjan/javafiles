package SocketProgramming.BothWay;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Server Side"); // it just for check that server side
        ServerSocket ss=new ServerSocket(9998);
        System.out.println("server is waiting for client"); // server created and waiting for cliend
        Socket s = ss.accept();// if it gets any request from client it will create a new Socket for that client
        System.out.println("Client is connected"); // client connected to server

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        int i =0;
        while ( i<5) {
            String str = br.readLine();
        System.out.println("Client message : "+str);
        i++;}
        String name = "Hey! you are connected to server";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
       // PrintWriter out = new PrintWriter(os);
        os.write(name);
        os.flush();
        System.out.println("message sent to client");
    }
}
