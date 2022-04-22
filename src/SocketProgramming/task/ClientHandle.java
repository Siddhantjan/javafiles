package SocketProgramming.task;

import java.io.*;
import java.net.Socket;

public class ClientHandle extends Thread{
    final Socket s;
    final DataInputStream dis;
    final DataOutputStream dos;

    public ClientHandle(Socket s, DataInputStream dis, DataOutputStream dos) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
    }

    @Override
    public void run() {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String str = br.readLine();
                    System.out.println("Client message : "+str);
                } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

