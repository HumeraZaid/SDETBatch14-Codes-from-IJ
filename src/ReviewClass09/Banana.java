package ReviewClass09;

public class Banana extends Fruit{

    String origin;

    Banana(String name, String shape, String color, String origin){
        super(name, shape, color);
        this.origin = origin;
    }

    /*
        When child class have same method name as super class -
        Overriding - two methods with same name BUT inside different class

        How to achieve overriding:
        1. Method signature MUST be same
        2. Return type MUST be same
        3. Access modifier/visibility MUST be same or MUST be higher
     */

    protected void grow()
    {
        System.out.println(name + " grows fast and fresh");
    }


    /*
       When child class have same static method as parent class,
       we are not achieving overriding
       this is called method hiding
     */

    public static void havePeel()
    {
        System.out.println("Banana is very easy to peel");
    }

    void makeSmoothie()
    {
        System.out.println("From " + name + " we get tasty smoothie");
    }

    void makePie()
    {
        System.out.println(name + " pie is delicious");
    }

    public static void main(String[] args) {
        Banana ban = new Banana("Banana", "banana shape", "yellow", "Ecuador");
        ban.haveBenefits(); // Coming from Fruit class
        ban.makeSmoothie();  // Coming from Banana class
        ban.grow();  // Coming from Banana class
        Banana.havePeel(); // Coming from Banana class

        Fruit fruit = new Banana("Banana", "banana shape", "green", "Africa");
        fruit.grow();   // Runtime polymorphism
        fruit.haveBenefits();

        Fruit.havePeel();   // Coming from Fruit class
        Banana.havePeel();  // Coming from Banana class


    }

}
