package Practice;

public class Repl157 {

    public static void main(String[] args){
        Child3 c = new Child3();
        c.m2();
    }

}

class Parent3{
    void m1()
    {
        System.out.println("m1 method in parent class");
    }
}

class Child3 extends Parent3{
    public void m1()
    {
        System.out.println("m1 method in child class");
    }

    public void m2()
    {
        this.m1();
        super.m1();
    }
}
