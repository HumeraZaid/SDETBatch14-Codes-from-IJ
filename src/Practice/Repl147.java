package Practice;

public class Repl147 {

    private String model;
    private double price;
    private int quantity;

    private double stockValue;

    public Repl147(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public void carStockValue()
    {
        System.out.println(model + " Stock Value " + (price*quantity));
    }
}

class Repl147_Test{
    public static void main(String[] args) {
        new Repl147("Toyota 2019", 625000, 4).carStockValue();
        new Repl147("BMW 2019", 326490, 2).carStockValue();
    }
}
