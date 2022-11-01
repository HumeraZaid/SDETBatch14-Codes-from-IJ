package ReviewClass10;

public class Fruit2 {

    protected String name;
    String shape;
    private String color;

    // final static variables are called constants
    // constants are written using UPPERCASE

    final public static boolean FRESH = true;
    final public static boolean CAN_EAT = true;

    public Fruit2(String name){
        this.name = name;
    }

    Fruit2(String name, String shape, String color){
        this(name);
        this.shape = shape;
        this.color = color;
    }

    void grow()
    {
        System.out.println("All fruits grow fresh - ");
    }

    public static void havePeel()
    {
        System.out.println("All fruits need to be peeled");
    }

    protected void haveBenefits()
    {
        System.out.println("All fruits are good for your health");
    }
}
