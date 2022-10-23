package Class20;

public class HW2_Programming {

    /* Create a class named 'Programming'.
       While creating an object of the class, if nothing is passed to it,
       then the message "I love programming languages" should be printed.
       If some String is passed to it, then in place of "programming languages",
       the value variable should be printed.
       Example, if we pass "Java", then "I love Java" should be printed.
     */

    void programming()
    {
        System.out.println("I love programming languages.");
    }

    void programming(String programmingLanguage)
    {
        System.out.println("I love " + programmingLanguage + ".");
    }

    public static void main(String[] args) {
        HW2_Programming print = new HW2_Programming();
        print.programming();
        print.programming("Java");
    }
}

