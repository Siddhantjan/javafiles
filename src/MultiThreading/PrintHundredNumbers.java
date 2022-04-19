package MultiThreading;

public class PrintHundredNumbers extends Thread{
  int count =1;
  public void displayNumbers(int num){
      synchronized (this){
          while (count<=num){
              System.out.print(count + " ");
              count = count + 1;
              notify();
          }
      }
  }

    public static void main(String[] args) {
      PrintHundredNumbers h=new PrintHundredNumbers();
        Thread t1= new Thread(new Runnable() {
          @Override
          public void run() {
              h.displayNumbers(20);
          }
      });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                h.displayNumbers(40);
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                h.displayNumbers(60);
            }
        });
        Thread t4= new Thread(new Runnable() {
            @Override
            public void run() {
                h.displayNumbers(80);
            }
        });
        Thread t5= new Thread(new Runnable() {
            @Override
            public void run() {
                h.displayNumbers(100);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
