package Practice;

public class Repl143_WithThisKeyword {

    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Repl143_WithThisKeyword(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Repl143_WithThisKeyword(String make, String model, int topSpeed, double price){
        this(make, model, 4, topSpeed, price);

    }

    public Repl143_WithThisKeyword(int numberOfDoors, int topSpeed, double price){
        this("unknown", "unknown", numberOfDoors, topSpeed, price);
    }

    public Repl143_WithThisKeyword(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0);
    }

    public void displayMethod()
    {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price );
    }
}

class Repl143_WithThisKeyword_Test {
    public static void main(String[] args) {
        Repl143_WithThisKeyword obj1 = new Repl143_WithThisKeyword("Toyota", "Prius", 4, 120, 30000);
        obj1.displayMethod();

        Repl143_WithThisKeyword obj2 = new Repl143_WithThisKeyword("Toyota", "Prius", 120, 30000);
        obj2.displayMethod();

        Repl143_WithThisKeyword obj3 = new Repl143_WithThisKeyword(4, 120, 30000);
        obj3.displayMethod();

        Repl143_WithThisKeyword obj4 = new Repl143_WithThisKeyword("Toyota", "Prius", 4);
        obj4.displayMethod();
    }
}