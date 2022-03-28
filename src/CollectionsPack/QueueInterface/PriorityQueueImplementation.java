package CollectionsPack.QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q); //[5, 6, 7]
        System.out.println(q.peek()); //5
        q.poll();
        System.out.println(q); //[6,7]
        System.out.println(q.element().equals(6)); //true
        System.out.println(q.element()); //6
        System.out.println(q.remove()); //6
        System.out.println(q);//[7]
        q.add(5);
        q.add(6);







    }
}
