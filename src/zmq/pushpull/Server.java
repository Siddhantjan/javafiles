package zmq.pushpull;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class Server {
    public static void main(String[] args) {
        try(ZContext context = new ZContext()){
            ZMQ.Socket socket = context.createSocket(SocketType.PUSH);
            socket.bind("tcp://127.0.0.1:9990");
        //    while(true){
                socket.send("Hello1");
            Thread.sleep(4000);
            socket.send("Hello2");
            Thread.sleep(4000);
                socket.send("Hello3");
                Thread.sleep(3000);
            socket.send("Hello4");
            Thread.sleep(4000);
            socket.send("Hello5");
            Thread.sleep(4000);
            socket.send("Hello6");
            Thread.sleep(4000);
                System.out.println("done");
        //}
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
