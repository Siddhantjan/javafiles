package CollectionsPack.ListInterface;

import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Siddhant");
        list.add("Ozlem");
        list.add("Mohit");
        System.out.println(list); //[Siddhant, Ozlem, Mohit]
        list.addFirst("GK");
        System.out.println(list); //[GK, Siddhant, Ozlem, Mohit]
        System.out.println(list.peek()); //Gk
        System.out.println(list.peekFirst()); //Gk
        System.out.println(list.poll()); //Gk
        System.out.println(list); //[Siddhant, Ozlem, Mohi



    }
}
