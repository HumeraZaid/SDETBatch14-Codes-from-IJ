package Quiz5;

public class Question8 {
}

class A{

    public int i;

    private int j;

}

class B extends A{

    void display(){

        super.j = super.i + 1;

        System.out.println(super.i + " " + super.j);

    }

}

class Inheritance {

    public static void main(String args[]){

        B obj = new B();

        obj.i=1;

        obj.j=2;

        obj.display();

    }

}