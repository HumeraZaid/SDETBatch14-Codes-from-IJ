package Class20;

public class HW3_StaticMethods {

    /* Create 1 class with a static method that has 3 overloaded forms.
       Then call each overloaded method with specific arguments and observe result.
     */

    static void name(String name)
    {
        System.out.println("My daughter's name is " +  name + ".");
    }

    static void name(String name, int age)
    {
        System.out.println(name + " is " + age + " years old.");
    }
    static void name(String name, String play)
    {
        System.out.println(name + " loves to play with " + play + ".");
    }

    public static void main(String[] args) {
        name("Zahra Zaid Shelia");
        name("Zahra", 4);
        name("Zahra", "dolls");
    }
}
