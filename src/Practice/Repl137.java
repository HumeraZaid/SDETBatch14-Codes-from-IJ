package Practice;

public class Repl137 {

    private String name;
    private String city;
    static String schoolName = "Syntax";
    private int batchNumber;

    void displayDetails()
    {
        System.out.println("My name is " + name + " and I live in " + city + "." + " I study at " +
                Repl137.schoolName + " in batch " + batchNumber);
    }

    public static void main(String[] args)
    {
        Repl137 obj = new Repl137();
        obj.name = "John";
        obj.city = "Miami";
        obj.batchNumber = 9;
        obj.displayDetails();

    }
}
