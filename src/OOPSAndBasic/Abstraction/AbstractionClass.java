package OOPSAndBasic.Abstraction;

abstract class Base{
    abstract void run();
}
public class AbstractionClass extends Base{
    public static void main(String[] args) {
        Base obj = new AbstractionClass();
        obj.run();
    }

    @Override
    void run() {
        System.out.println("Define");
    }
}
