package Practice;

public class Repl143_WithoutThisKeyword {

    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Repl143_WithoutThisKeyword(String m1, String m2, int n, int t, double p){
        make = m1;
        model = m2;
        numberOfDoors = n;
        topSpeed = t;
        price = p;
    }

    public Repl143_WithoutThisKeyword(String m1, String m2, int t, double p)
    {
        make = m1;
        model = m2;
        numberOfDoors = 4;
        topSpeed = t;
        price = p;
    }

    public Repl143_WithoutThisKeyword(int n , int t, double p)
    {
        make = "unknown";
        model = "unknown";
        numberOfDoors = n;
        topSpeed = t;
        price = p;
    }

    public Repl143_WithoutThisKeyword(String m1, String m2, int n)
    {
        make = m1;
        model = m2;
        numberOfDoors = n;
        topSpeed = 90;
        price = 0;
    }
    public void displayMethod()
    {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price );
    }
}

class Repl143_WithoutThisKeyword_Test{
    public static void main(String[] args) {
        Repl143_WithoutThisKeyword obj1 = new Repl143_WithoutThisKeyword("Toyota", "Prius", 4, 120, 30000);
        obj1.displayMethod();

        Repl143_WithoutThisKeyword obj2 = new Repl143_WithoutThisKeyword("Toyota", "Prius", 120, 30000);
        obj2.displayMethod();

        Repl143_WithoutThisKeyword obj3 = new Repl143_WithoutThisKeyword(4, 120, 30000);
        obj3.displayMethod();

        Repl143_WithoutThisKeyword obj4 = new Repl143_WithoutThisKeyword("Toyota", "Prius", 4);
        obj4.displayMethod();
    }
}
