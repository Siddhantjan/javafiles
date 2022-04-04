package CollectionsPack.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        deque.remove();
        System.out.println(deque);

    }

}
