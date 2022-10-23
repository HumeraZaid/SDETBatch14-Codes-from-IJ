package Practice;

public class Repl153 {

    public static void main(String[] args)
    {
        Child1 child = new Child1();
    }
}

class Parent1{
    Parent1(){
        System.out.println("This is Parent constructor");
    }
}

class Child1 extends Parent1{
    Child1()
    {

    }
}

