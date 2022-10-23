package Practice;

public class Repl158 {

    public static void main(String[] args){
        Child4 child = new Child4("Fairfax");
        child.display();
    }

}

class Parent4{
    String city;

    Parent4(String city){
        this.city = city;
    }

    public void display()
    {
        System.out.println("City name " + city);
    }
}

class Child4 extends Parent4{

    Child4(String city){
        super(city);
    }
}
