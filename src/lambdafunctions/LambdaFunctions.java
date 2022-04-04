package lambdafunctions;

import java.util.ArrayList;
import java.util.List;

interface lambda_func{
    public String printingMessage();

}
interface example2{
    public String printingMessage(String name);
}
interface example3{
    int add(int a,int b);
}
public class LambdaFunctions {

    public static void main(String[] args) {
        lambda_func l =()->{
            return "Hey I am Siddhant";
        };
        System.out.println(l.printingMessage());

        example2 s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.printingMessage("Siddhant"));

        example2 s2=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s2.printingMessage("Mohit"));

        // Multiple parameters in lambda expression
        example3 ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        example3 ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));


        // Lambda expression with return keyword.
        example3 ad3=(int a,int b)->{
            return (a+b);
        };
        System.out.println(ad2.add(100,200));


        //forEach
        List<String> list=new ArrayList<String>();
        list.add("Siddhant");
        list.add("Mohit");
        list.add("Sarthak");
        list.add("Rajiv");

        list.forEach(
                System.out::println //  (n)->System.out.println(n)
        );
    }
}
