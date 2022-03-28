package CollectionsPack.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
        //by default the capacity of Arraylist is 10
        // not a thread safe
        //
        ArrayList<String>  list1= new ArrayList<>(); // Default size 10
        list1.add("Siddhant");
        list1.add("Arun");
        list1.add("Preeti");
        list1.add("Suman");
       System.out.println(list1); //[Siddhant, Arun, Preeti, Suman]
        ArrayList<Integer>  list2= new ArrayList<>();
        list2.add(2);
        list2.add(3);
        System.out.println(list2); //[2, 3]
        ArrayList<Float>  list3= new ArrayList<>();
        list3.add(5.0f);
        list3.add(9.8f);
        System.out.println(list3); //[5.0, 9.8]
        ArrayList<Model>  list4= new ArrayList<>();
        list4.add(new Model("Siddhant",21));
        list4.add(new Model("Ozlem",21));
        for (Model s : list4){
            System.out.println(s.getName()+" "+s.getAge());
        }
        System.out.println(list4.size());

        ArrayList<Integer>  l1= new ArrayList<>(Arrays.asList(1,0,3));

        //Some methods
        System.out.println(list2); //[2,3]
        list2.add(0,4);
        System.out.println(list2);//[4, 2, 3]
        list2.addAll(l1);
        System.out.println(list2);//[4, 2, 3, 1, 0, 3]
        list2.addAll(0,l1);
        System.out.println(list2);//[1, 0, 3, 4, 2, 3, 1, 0, 3]
      //  System.out.println(list2.get(list2.size()+3)); //Throw an exception for IndexOutofBoundException

        list2.remove(0);
        System.out.println(list2); //[0, 3, 4, 2, 3, 1, 0, 3]
        System.out.println(list2.isEmpty()); //false
        Object[] a = list2.toArray();
        System.out.println(Arrays.toString(a)); //[0, 3, 4, 2, 3, 1, 0, 3]
        System.out.println(a.length); //8
        System.out.println(list2.contains(2));//true
        System.out.println(list2.lastIndexOf(0)); //6
        list2.removeAll(l1);
        System.out.println(list2);//[4, 2]
        list2.clear();
        System.out.println(list2);
        List<Integer> l0= new ArrayList<>();
        l0.add(5);
        l0.add(5);
        l0.add(9);
        l0.add(4);
        l0=Collections.synchronizedList(l0); // return a synchronized (thread-safe) list backed by the specified list
        System.out.println(l0);//[5, 5, 9, 4]

    }
}
