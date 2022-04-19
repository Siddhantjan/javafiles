package MultiThreading;


import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class CollectionsThread {

    static LinkedBlockingQueue<Integer> s = new LinkedBlockingQueue<>();
    static ArrayList<Integer> a=new ArrayList<>();
    public void addNumber(int item) throws InterruptedException {
        for(int i = 0 ;i<5;i++)
        {
         //   a.add(i+item);
            s.add(i+item);

        }
    }
    public void removeNumber(){
        while (!s.isEmpty()){
                  System.out.println( s.remove());
        }
    }


  /*  public static Vector<Integer> completed = new Vector<Integer>();
    static int i = 0;
    public void addNumber(int num,String name){

            completed.add(num);
      // System.out.println("inserting  By:"+name+" element is "+ num);


    }
    public void removeNumber(){
            for (int i = 0; i < completed.size(); i++) {
                System.out.println("Thread 4 : "+completed.get(i));
               completed.remove(i);
               i=i-1;

            }
    }*/
    public static void main(String[] args) {

        CollectionsThread c = new CollectionsThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                    try {
                        c.addNumber(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                    try {
                        c.addNumber(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                    try {
                        c.addNumber(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.removeNumber();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
       // System.out.println(a);

     /*   Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = i; k < 5; k++) {
                    c.addNumber(k, "thread 1");
                    i++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int f = i + 5;
                for (int k = i; k < f; k++) {
                    c.addNumber(k, "thread 2");
                    i++;
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int f = i + 5;
                for (int k = i; k < f; k++) {
                    c.addNumber(k, "thread 3");
                    i++;
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.removeNumber();
            }
        });
t1.setPriority(10);
t2.setPriority(9);
t3.setPriority(8);
t4.setPriority(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
*/


    }
}
