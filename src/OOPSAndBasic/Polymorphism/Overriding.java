package OOPSAndBasic.Polymorphism;
class Base{
    void message(){
        System.out.println("I am in Base");
    }

}
class Derived extends Base{
    void message(){
        System.out.println("I am in Derived");
    }

}
public class Overriding {

    public static void main(String[] args) {
        Base d1 = new Base();
        d1.message();
        Base d = new Derived();
        d.message();;

    }
}
