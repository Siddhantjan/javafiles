package CollectionsPack.QueueInterface;

public class QueueImplemented {
    //static
    int  queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enqueue(int data){

        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        }
        else {
            System.out.println("Queue is full");
        }
    }
    public int deQueue(){
        int data = queue[front];
        if (!isEmpty()) {
            front = (front + 1) % 5;
            size = size - 1;
        }
        else {
            System.out.println("Queue is empty");
        }
        return data;

    }
    public void show(){
        System.out.println("elements :");
        for(int i =0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return  getSize()==0;
    }
    public boolean isFull(){
        return getSize()==5;
    }
}
