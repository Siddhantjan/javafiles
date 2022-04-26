package zmq.pushpull;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class Client {
    public static void main(String[] args) {
        try (ZContext context = new ZContext()) {
            ZMQ.Socket socket = context.createSocket(SocketType.PULL);
            socket.connect("tcp://127.0.0.1:9990");
            while (true){
                String message = socket.recvStr();
            System.out.println(message);
                Thread.sleep(10000);
        }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
