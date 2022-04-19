package MultiThreading;
public class GarbageCollection {
    /*
    The finalize() method is invoked each time before the object is garbage collected.
    This method can be used to perform cleanup processing.
     */
    public void finalize(){System.out.println("object is garbage collected");}
    public static void main(String[] args) {
        GarbageCollection g1= new GarbageCollection();
        GarbageCollection g2= new GarbageCollection();
        g1=null;
        g2=null;
        System.gc();
        /*
        The gc() method is used to invoke the garbage collector to perform cleanup processing.
         The gc() is found in System and Runtime classes.
         */
    }
}
