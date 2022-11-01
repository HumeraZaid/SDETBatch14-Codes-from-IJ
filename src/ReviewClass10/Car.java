package ReviewClass10;

interface Drivable{

    // By default, all variables in an interface are public static final

    boolean DRIVES = true;

    // We cannot have a constructor

    // By default, all methods in an interface are public abstract

    void brakes();
}

interface Vehicle{

    void haveMotor();

    // From Java 8, we can have static and default methods in an interface

    default void haveBrake()
    {
        System.out.println("All vehicle have brake");
    }

    static void honk()
    {
        System.out.println("All vehicles honk");
    }
}

// With the help of an abstract class, we can achieve 0 to 100% abstraction

public abstract class Car {
    String color, make, model;
    public static final int WHEELS = 4;

    public Car(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }

    void drive()
    {
        System.out.println("All cars can drive");
    }

    abstract void start();

    abstract void stop();
}

class Tesla extends Car implements Drivable, Vehicle{

    Tesla(String make, String model, String color)
    {
        super(make, model, color);
    }

    public void start()
    {
        System.out.println(make + "starts automatically");
    }

    public void stop ()
    {
        System.out.println(make+" stops when we press break");
    }

    public void charge()
    {
        System.out.println("You need to charge "+make);
    }

    public void brakes()
    {
        System.out.println(make+" can break");
    }

    public void haveMotor() {
        System.out.println(make +" have motor");
    }

    public void haveBrake()
    {

    }
}
