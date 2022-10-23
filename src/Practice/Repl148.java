package Practice;

public class Repl148 {
    private String item;
    private double price;
    private int quantity;


    public Repl148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice()
    {
        double totalValue = price*quantity;
        System.out.println(item + " Total Value " + totalValue );
        return totalValue;
    }
}

class Repl148_Test{
    public static void main(String[] args) {
        Repl148 obj1 = new Repl148("Blanket", 49.99, 2);
        double returnValue1 = obj1.itemTotalPrice();

        Repl148 obj2 = new Repl148("Mattress", 439.18, 1);
        double returnValue2 = obj2.itemTotalPrice();

        double sum = returnValue1 + returnValue2;

        System.out.println("You purchased " + sum + " Today");
    }
}
