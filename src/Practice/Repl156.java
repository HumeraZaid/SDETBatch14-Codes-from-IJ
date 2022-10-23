package Practice;

public class Repl156 {

    public static void main(String[] args){

        B1 b = new B1();
        b.displayValue();
    }
}


class A1{

    int i = 10;
}

class B1 extends A1{

    int i = 20;

    void displayValue()
    {
        System.out.println(i);
        System.out.println(super.i);
    }
}