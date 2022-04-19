package MultiThreading;
class MyThread extends Thread{
    public void run(){
        System.out.println("shut down hook task completed..");
    }
}
public class ShutDownHookImp {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new MyThread());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        System.exit(0); // jvm stopped due
        try{Thread.sleep(3000);}catch (Exception e) {}
    }
}
