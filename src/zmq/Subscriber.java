package zmq;
import org.zeromq.SocketType;
import org.zeromq.ZMQ;
import org.zeromq.ZThread;

import java.nio.charset.StandardCharsets;


public class Subscriber{
    public static void main(String[] args) {
        ZMQ.Context context= ZMQ.context(1);
        System.out.println("Connecting to server or publisher");
        ZMQ.Socket requester = context.socket(SocketType.REQ);
        requester.connect("tcp://localhost:5555");
        for (int request = 0; request!=10;request++){
            String req = "Hello";
            requester.send(req.getBytes(StandardCharsets.UTF_8));
            System.out.println("Message sent");
            byte [] reply = requester.recv(0);
            System.out.println("Received : "+new String(reply)+" for "+request);
        }
        requester.close();
        context.term();
    }
}