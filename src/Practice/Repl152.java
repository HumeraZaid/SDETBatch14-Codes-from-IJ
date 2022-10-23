package Practice;

public class Repl152 {
    public static void main(String[] args){
        Child child = new Child("Vienna");
    }
}

class Parent{
    String city;

    Parent(String city)
    {
        this.city = city;
        System.out.println(city);
    }

    Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    Child(String city){
        super(city);
    }
}
