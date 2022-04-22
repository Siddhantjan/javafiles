package SocketProgramming.OneWay;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocClient {
    public static void main(String[] args) throws IOException {
       String ip = "localhost";
       int port=9999;
        Socket s = new Socket(ip,port);
        String str="Hey I am Siddhant";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(str);
        out.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String serverMessage = br.readLine();
        System.out.println("Server message : "+serverMessage);

    }
}
