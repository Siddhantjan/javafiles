package MultiThreading;

public class ThreadGrouping implements Runnable{
    public static void main(String[] args) {
        ThreadGrouping runnable = new ThreadGrouping();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
        for(int i=0;i<15;i++){
            String s="t"+Integer.toString(i);
            Thread t=new Thread(tg1,runnable,s);
            t.start();
        }
//        Thread t1 = new Thread(tg1, runnable,"one");
//        t1.start();
//        Thread t2 = new Thread(tg1, runnable,"two");
//        t2.start();
//        Thread t3 = new Thread(tg1, runnable,"three");
//        t3.start();

        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();
        tg1.setMaxPriority(7);
        tg1.list();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
