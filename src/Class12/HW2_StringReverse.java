package Class12;

public class HW2_StringReverse {

    public static void main(String[] args) {

        /*
         * Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String str1 = "Sunday";
        String str2 = "";

        for(int i=str1.length()-1; i>=0; i--)
        {
            str2 = str2 + str1.charAt(i);

        }

        System.out.print(str1 + " -> " + str2);
    }

}
