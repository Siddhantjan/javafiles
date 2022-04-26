package zmq.others;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ZContext context = new ZContext()){
            ZMQ.Socket socket = context.createSocket(SocketType.PUSH);
            socket.bind("tcp://localhost:9990");
            System.out.println("Reconnect IVL Max "+socket.getReconnectIVLMax());
            System.out.println("Reconnect IVL "+socket.getReconnectIVL());
            System.out.println("back log "+socket.getBacklog());
            System.out.println("linger "+socket.getLinger());
            System.out.println("last end point "+socket.getLastEndpoint());
            System.out.println("heart beat Ivl "+socket.getHeartbeatIvl());
            System.out.println("heartbeat timeout "+socket.getHeartbeatTimeout());


            System.out.println(socket.setReconnectIVLMax(100));
            System.out.println(socket.setReconnectIVL(10));
            System.out.println(socket.setBacklog(10));
            System.out.println(socket.setLinger(12));
            System.out.println(socket.setHeartbeatIvl(1000));
            System.out.println(socket.setHeartbeatTimeout(122));

            System.out.println("Reconnect IVL Max "+socket.getReconnectIVLMax());
            System.out.println("Reconnect IVL "+socket.getReconnectIVL());
            System.out.println("back log "+socket.getBacklog());
            System.out.println("linger "+socket.getLinger());
            System.out.println("last end point "+socket.getLastEndpoint());
            System.out.println("heart beat Ivl "+socket.getHeartbeatIvl());
            System.out.println("heartbeat timeout "+socket.getHeartbeatTimeout());

        }
    }
}
