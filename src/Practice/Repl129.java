package Practice;

public class Repl129 {

    static String countryName;
    static String continent;

    void display()
    {
        System.out.println(countryName + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        Repl129 obj = new Repl129();
        obj.countryName = "Morocco";
        obj.continent = "Africa";
        obj.display();
    }
}
