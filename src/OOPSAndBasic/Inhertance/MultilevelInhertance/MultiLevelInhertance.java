package OOPSAndBasic.Inhertance.MultilevelInhertance;
class one{
    one(){
        System.out.println("one constructor called");
    }
}
class second extends one{
    second(){
        System.out.println("second constructor called");
    }
}
class third extends second{
    third(){
        System.out.println("third constructor called");
    }
}

public class MultiLevelInhertance {
    public static void main(String[] args) {
        third t = new third();
    }
}
