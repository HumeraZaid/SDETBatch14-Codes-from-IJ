package Practice;

public class Repl149_A {

    public void printMethod1()
    {
        System.out.println("Class A");
    }
}

class Repl149_B extends Repl149_A{
    public void printMethod2()
    {
        System.out.println("Class B");
    }
}

class Repl149_Test{
    public static void main(String[] args) {
        Repl149_B obj = new Repl149_B();
        obj.printMethod1();
        obj.printMethod2();
    }
}
