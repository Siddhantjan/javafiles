package SocketProgramming.OneWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Server Side"); // it just for check that server side
        ServerSocket ss=new ServerSocket(9999);
        System.out.println("server is waiting for client"); // server created and waiting for cliend
        Socket s = ss.accept();// if it gets any request from client it will create a new Socket for that client
        System.out.println("Client is connected"); // client connected to server


    }
}
