package Class20;

public class MethodOverloadingD2 {

    private static MethodOverloading md;

    void F1(String name, int number)
    {
        System.out.println("1");
    }

    void F1(String name, int number, int number2)  // By changing the number of parameters
    {
        System.out.println("2");
    }

    void F1(int num1, int number)  // By changing the dataType of parameters
    {
        System.out.println("3");
    }

    void F1(int number, String name)  // By changing the sequence of parameters
    {
        System.out.println("4");
    }

    public static void main(String[] args) {
        MethodOverloadingD2 md = new MethodOverloadingD2();
        md.F1("Taras", 20);
    }
}
