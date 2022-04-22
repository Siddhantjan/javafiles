package SocketProgramming.task;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
    public static void main(String[] args) throws IOException {
        String ip = "localhost";
        int port=9995;
        int i =0;
        for(;i<1000000000;i++) {
            Socket s = new Socket(ip, port);
            String str = "Hey I am Siddhant";
            OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
            PrintWriter out = new PrintWriter(os);
            out.println(i+""+str);
            out.flush();
        }
        System.out.println("i :"+i);
    }
}
