package OOPSAndBasic.Abstraction;

interface print{
     void pin();
}
public class InterfaceClasses implements print {
    public void pin() {
        System.out.println("hey");
    }
    public static void main(String[] args) {
        InterfaceClasses o = new InterfaceClasses();
        o.pin();
    }



}
