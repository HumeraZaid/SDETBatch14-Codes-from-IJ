package Practice;

public class Repl144 {
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public Repl144(String l, double p, String c, boolean h, int s) {
        label = l;
        price = p;
        category = c;
        hasExpiration = h;
        stock = s;
    }

    public Repl144(String l, double p, int s) {
        label = l;
        price = p;
        category = "misc";
        hasExpiration = false;
        stock = s;
    }

    public Repl144(String l, double p) {
        label = l;
        price = p;
        stock = 0;
    }

    void displayOutput()
    {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration +
                          " " + stock);
    }
}

class Repl144_Test{
    public static void main(String[] args) {
        new Repl144("Eggs", 3, "Produce", true, 10).displayOutput();
        new Repl144("Paper Towels", 2, 24).displayOutput();
        new Repl144("Paper Towels", 2 ).displayOutput();
    }
}