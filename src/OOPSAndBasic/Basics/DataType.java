package OOPSAndBasic.Basics;

import java.util.Scanner;
class Base {
    Base(){
      System.out.println("Base");
    }
}
public class DataType {
    public static void main(String[] args) {
        int a; // declare
        a=5;
        float b = 5.0f;
        double c = 5.0d;
        char d = 'a';
        System.out.println(a +" "+b+" "+c+" "+d); // print statment
     //Input
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        float f = sc.nextFloat();
        double g = sc.nextDouble();
        char h = sc.nextLine().charAt(0);
        String s = sc.nextLine();
        Base b1 = new Base(); // Object Creation

        int x = Integer.parseInt(s); // Wrapper Class


    }
}
