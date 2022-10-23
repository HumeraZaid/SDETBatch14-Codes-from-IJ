package Class13;

public class HW1_StringWithoutSpaces {

    public static void main(String[] args) {

        /*
         * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */

        String str1 = "Success is not final; failure is not fatal.";
        String str2 = str1.replaceAll("\\s","");
        System.out.println(str2);

    }

}
