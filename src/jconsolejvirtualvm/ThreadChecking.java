package jconsolejvirtualvm;

public class ThreadChecking {
    public static void main(String[] args) throws InterruptedException {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    // Thread.sleep(10000);
                   // notify();
                    System.out.println(Thread.currentThread().getState());
                }

            }
        });
        s1.setName("Siddhant");
        s1.start();

    }
}
