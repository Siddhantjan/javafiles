package OOPSAndBasic.Encapsulation;

public class Student {
    public static void main(String[] args) {
        DataModel d1 = new DataModel("Siddhant",21,90);
        DataModel d2 = new DataModel("Arun",21,90);
        System.out.println(d1.getName()+" "+d1.getMarks());
        System.out.println(d2.getName()+" "+d2.getMarks());
    }

}
