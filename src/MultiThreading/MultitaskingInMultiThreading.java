package MultiThreading;
class Simple1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
}

class Simple2 extends Thread{
    public void run(){
        System.out.println("task two");
    }
}
public class MultitaskingInMultiThreading extends Thread{
//    public void run() {
//        System.out.println("Task One");
//    }

    public static void main(String[] args) {
//        MultitaskingInMultiThreading t1 = new MultitaskingInMultiThreading();
//        MultitaskingInMultiThreading t2 = new MultitaskingInMultiThreading();
//        MultitaskingInMultiThreading t3= new MultitaskingInMultiThreading();
//        t1.setName("first Thread");
//        t2.setName("second Thread");
//        t3.setName("third Thread");
//        System.out.println(t1.getName());
//        t1.start();
//        System.out.println(t2.getName());
//        t2.start();
//        System.out.println(t3.getName());
//        t3.start();
//        Each thread run in a separate callstack.
        Simple1 t1=new Simple1();
        Simple2 t2=new Simple2();

        t1.start();
        t2.start();
    }
}
