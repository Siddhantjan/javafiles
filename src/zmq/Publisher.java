package zmq;

import org.zeromq.SocketType;
import org.zeromq.ZMQ;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Publisher {
    public static void main(String[] args) throws Exception{
        ZMQ.Context context = ZMQ.context(1);
        // Socket to talk to client
        ZMQ.Socket responder = context.socket(SocketType.REP);
        responder.bind("tcp://*:5555");

        while (!Thread.currentThread().isInterrupted()){
            byte[] request=responder.recv(0);
            System.out.println("Received :"+ new String(request));

            Thread.sleep(1000);
            String reply ="World";
            responder.send(reply.getBytes(StandardCharsets.UTF_8));
        }
        responder.close();
        context.term();
    }

}