package ReviewClass10;

public class Apple2 extends Fruit2 {

    String size;
    String taste;
    double price;

    Apple2(String name, String shape, String color, String size){
        super(name, shape, color);
        this.size = size;
    }

    Apple2(String name, String shape, String color, String size, String taste, double price) {
        this(name, shape, color, size);
        this.taste = taste;
        this.price = price;
    }

    //  Overloading - Methods with same name within same class

    /*
       How to achieve overloading:
       1. Change number of parameters
       2. Change type of parameters

       In overloading, method signature MUST be different
       We do not care about return type

       method signature = name + parameters
     */

    void makeJuice()
    {
        System.out.println("From " + name + " we can make " + taste + " juice");
    }

    /*
        This is not overloading since signature is same
        String makeJuice(){

        }
     */

    void makeJuice(String fruit)
    {
        System.out.println("We can have juice from " + name + " mixed with " + fruit);
    }

    public static void main(String[] args) {
        Apple2 app = new Apple2("Apple", "circle", "red", "big");
        // app.color;     Not visible since its access modifier is PRIVATE
        System.out.println(app.name);
        System.out.println(app.shape);

        System.out.println(Fruit2.FRESH);
        System.out.println(Apple2.FRESH);

        app.grow();  // Coming from Fruit class
        app.haveBenefits();  // Coming from Fruit class
        app.makeJuice();  // Coming from Apple class
    }

}
