package Class19;


class Vehicle{
    int noOfWheels;
    int topSpeed;

    public void printTopSpeed()
    {
        System.out.println(topSpeed);
    }
}
public class Car extends Vehicle{
    String model;
    String make;
    int year;
}

class Tesla extends Car{
    void printInfo()
    {
        System.out.println("I am an Electrical Car");
    }
}

class Toyota extends Car{
    void printInfo()
    {
        System.out.println("I am a Combustion Engine Car");
    }
}

/*
class CustomCar extends Toyota, Telsa{
    Not allowed because of diamond problem
}
*/

class Tester{
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.printTopSpeed();
    }
}