package MultiThreading;

import java.io.IOException;

public class RuntimeClassMethods {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Total Memory: "+Runtime.getRuntime().totalMemory());
        System.out.println("Free Memory: "+Runtime.getRuntime().freeMemory());
        for(int i=0;i<10000;i++){
            new RuntimeClassMethods();
        }
        System.out.println("After creating 10000 instance, Free Memory: "+Runtime.getRuntime().freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: "+Runtime.getRuntime().freeMemory());
    }
}
