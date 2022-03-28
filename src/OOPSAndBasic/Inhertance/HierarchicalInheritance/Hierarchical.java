package OOPSAndBasic.Inhertance.HierarchicalInheritance;
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
class third extends one{
    third(){
        System.out.println("third constructor called");
    }
}
class fourth extends one{
    fourth(){
        System.out.println("forth constructor called");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
       second s = new second();
       third t = new third();
       fourth f = new fourth();
    }
}
