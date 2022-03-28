package CollectionsPack.ListInterface;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> s1= new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println(s1); //[1, 2, 3, 4]
        System.out.println(s1.peek()); //4
        s1.pop();
        System.out.println(s1); //[1, 2, 3]
      s1.push(9);
            System.out.println(s1.search(9)); //1





    }
}
