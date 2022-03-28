package OOPSAndBasic.Polymorphism;
class base{
    public static void main(String[] args) {
      main(5);
      main("Siddhant");
    }
    public static void main(int a){
        System.out.println("int "+a);
    }
    public static void main(String a){

        System.out.println("String "+a);
    }
}
public class Overloading {
    public static void foo(){
        System.out.println("default");

    }
    public static void foo(int x){
        System.out.println("int value :"+x);

    }
    public static void foo(String s){
        System.out.println("String name"+s);

    }
    public static void main(String[] args) {
        foo();
        foo(2);
        foo("Siddhant");
    }
}
