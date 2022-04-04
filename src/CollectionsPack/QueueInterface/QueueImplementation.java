package CollectionsPack.QueueInterface;

public class QueueImplementation {
    public static void main(String[] args) {
        QueueImplemented q= new QueueImplemented();
        q.enqueue(5);
        q.enqueue(7);;
        q.show(); //5 7
        System.out.println(q.deQueue());
        q.show(); //7
        q.enqueue(9);
        q.enqueue(90);
        q.enqueue(99);
        q.enqueue(999);
        q.enqueue(9999);
        q.show();
        q.deQueue();
        q.show();

    }
}
