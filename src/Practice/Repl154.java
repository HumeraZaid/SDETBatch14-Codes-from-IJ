package Practice;

public class Repl154 {

    public static void main(String[] args){
        Child2 child1 = new Child2();
        Child2 child2 = new Child2(10);
    }

}

class Parent2{
    Parent2(){
        System.out.println("Parent Constructor without argument");
    }

    Parent2(int number){
        System.out.println(number);
    }
}

class Child2 extends Parent2{
    Child2()
    {
        System.out.println("Child Constructor without argument");
    }

    Child2(int number)
    {
        super(number);
    }
}

