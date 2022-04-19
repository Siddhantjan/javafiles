package MultiThreading;

public class Workspace extends Thread {

    public void run(){


        while(true){
            System.out.println("thread is running...");
        }
    }
    public static void main(String[] args) {
        Workspace w1 = new Workspace();
        w1.start();
        w1.setName("Siddhant");
    }
}
