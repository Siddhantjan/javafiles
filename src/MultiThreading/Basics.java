package MultiThreading;
class ABC implements Runnable {

    @Override
    public void run() {
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ Basics.t1.getState());
        try{
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Basics implements Runnable{
    public static Thread t1;
    public static Basics obj;


    public static void main(String[] args) {
        obj = new Basics();
        t1 = new Thread(obj);

// thread t1 is spawned
// The thread t1 is currently in the NEW state.
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());

// invoking the start() method on
// the thread t1
        t1.start();

// thread t1 is moved to the Runnable state
        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
        System.out.println("t1 is a Daemon thread or not "+t1.isDaemon());

    }

    public void run()
    {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

// thread t2 is created and is currently in the NEW state.
        System.out.println("The state of thread t2 after spawning it - "+ t2.getState());
        t2.start();

// thread t2 is moved to the runnable state
        System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

// try-catch block for the smooth flow of the  program
        try
        {
// moving the thread t1 to the state timed waiting
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );

// try-catch block for the smooth flow of the  program
        try
        {
// waiting for thread t2 to complete its execution
            t2.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
     //show the terminated thread
        System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
     //check alive status if false it means terminated
        System.out.println("check t2 is alive or not : "+t2.isAlive());
        System.out.println(t1.getName()+"  "+t2.getName());
        t1.setName("Siddhant");
        System.out.println(t1.getName() +" "+t2.getName());
        System.out.println(t2.getPriority()+" "+t1.getPriority());
        t1.setPriority(9);
        System.out.println(t2.getPriority()+" "+t1.getPriority());
    }
}
