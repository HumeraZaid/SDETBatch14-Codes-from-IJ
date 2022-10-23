package Class12;

public class HW1_MiddleCharacter {
    public static void main(String[] args) {

        /*
         * Create a String and if the String is not empty perform the following:
         * If the String has an odd number of characters and has 3 or more characters,
         * print the character in the middle of the String.
         *
         *
         */

        String str = "Zahra";
        char ch = '"';
        if(!str.isEmpty())
        {
            if(str.length() > 3 && (str.length())/2!=0)
            {
                System.out.println("The character in the center of the string " + ch +  str + ch + " is " +
                        str.charAt((str.length()/2)) + ".");
            }
        }
    }

}
