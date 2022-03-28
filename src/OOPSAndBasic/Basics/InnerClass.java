package OOPSAndBasic.Basics;

public class InnerClass {
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }

    public static void main(String[] args) {
        InnerClass i1 = new InnerClass();
        InnerClass.Inner i2 = i1.new Inner();
        i2.msg();
    }
}
