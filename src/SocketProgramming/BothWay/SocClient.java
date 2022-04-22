package SocketProgramming.BothWay;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       String ip = "localhost";
       int port=9998;
        Socket s = new Socket(ip,port);
        int i =0;
        while(i<5) {
            String str = sc.nextLine();
            OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
            PrintWriter out = new PrintWriter(os);
            out.println(str);

            out.flush();
            i++;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String serverMessage = br.readLine();
        System.out.println("Server message : "+serverMessage);
    }
}
