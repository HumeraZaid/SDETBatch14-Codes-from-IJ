package Class13;

public class StringBuilderDemo {
    public static void main(String[] args) {

        /*
        StringBuilder allows any methods to change the original contents of the variables
        because StringBuilder is mutable.
         */


        StringBuilder stringBuilder =  new StringBuilder("IntelliJ is great!");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        /*
        String does not allow any methods to change the original contents of the variables
        because String is immutable.
         */

        String str="IntelliJ";
        str.toLowerCase();
        System.out.println(str);

        /*
        These two variables (created using String) will have same ID / memory address
        because the contents are same.

        String country = "USA";
        String home = "USA";
        */

        /*
        These two variables (created using StringBuilder) will have different ID / memory address
        though the contents are same.

        StringBuilder state = "New York";
        StringBuilder city = "New York";

         */
    }
}
