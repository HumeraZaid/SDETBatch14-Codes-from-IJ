package Practice;

public class Repl122 {

    String countryName;
    String capital;
    int populationSize;

    void display()
    {
        System.out.println("The capital of " + countryName + " is " + capital +
                " and population is " + populationSize);
    }

    public static void main(String[] args) {
        Repl122 obj1 = new Repl122();
        obj1.countryName = "USA";
        obj1.capital = "Washington DC";
        obj1.populationSize = 330000000;
        obj1.display();

        Repl122 obj2 = new Repl122();
        obj2.countryName = "Kazakhstan";
        obj2.capital = "Astana";
        obj2.populationSize = 18500000;
        obj2.display();
    }
}
