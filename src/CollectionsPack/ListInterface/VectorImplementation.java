package CollectionsPack.ListInterface;

import java.util.Vector;

public class VectorImplementation {
    public static void main(String[] args) {
        Vector<Integer> v1= new Vector<>();
        //System.out.println(v1.size()); //0
      //  v1.setSize(12);
        //System.out.println(v1.size()); //12
        Vector<Integer> v2= new Vector<>(4,5);

        v1.add(5);
        v1.add(0);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        System.out.println(v1); //[5, 0, 1, 2, 3, 4]
        v1.removeElementAt(2);
        System.out.println(v1); //[5, 0, 2, 3, 4]


    }
}
