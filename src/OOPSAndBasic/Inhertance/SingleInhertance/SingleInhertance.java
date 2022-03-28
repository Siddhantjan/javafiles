package OOPSAndBasic.Inhertance.SingleInhertance;
class base{
    int salary  = 15000;
}
class derived extends base{
    int bonus = 5000;
    int festival(){
       return  this.bonus+super.salary;
    }
}
public class SingleInhertance {
    public static void main(String[] args) {
        derived b= new derived();
        System.out.println(b.festival());
    }
}
