package methodchaining;

public class MethodChaining {
    int age;
    String name;
    char grade;
    public MethodChaining setAge(int age) {
        this.age = age;
        return this;
    }

    public MethodChaining setGrade(char grade) {
        this.grade = grade;
        return this;
    }

    public MethodChaining setName(String name) {
        this.name = name;
        return this;
    }
    public MethodChaining display(){
        System.out.println("Age: "+age+" Name: "+name+" Grade: "+grade);
        return this;
    }
    public static void main(String[] args) {
        new MethodChaining().setAge(22).setName("Siddhant").setGrade('A').display().display().display();
    }
}
