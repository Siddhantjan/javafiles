package SocketProgramming;

import java.net.URL;

public class UrlClass {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.motadata.com/about-us/#award-recognition");

            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());

        }catch(Exception e){System.out.println(e);}
    }
}
