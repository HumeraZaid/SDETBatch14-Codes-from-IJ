package Class18;

public class Car {
    // Common class is also called parent class or super class

    String model;
    String make;
    int year;
    String color;
    int toSpeed;
    double price;

    // if a field or method has private access modifier in the parent class, then child classes can't use it.

    private String engineType;

    void printCarDetails()
    {
        System.out.println("Model " + model + " Make " + make + " Color " + color);
    }
}

class BMW extends Car {

    // Child classes are also called base classes or derived classes

    double engineCC;
}

class tesla extends Car{

}

class Toyota extends Car{
    double engineCC;
}

class CarTest{
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make = "BMW";
        bmw.color = "Black";
        bmw.model = "x8";
        bmw.engineCC = 200;
        bmw.printCarDetails();
    }
}
