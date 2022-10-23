package Class14;

public class StringBuildervsBuffer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringBuilder stringBuilder = new StringBuilder("Today is java class");  // Mostly used class, newer, better, faster

        StringBuffer stringBuffer = new StringBuffer("Today is java class");  // Older one, slow and not used mostly

        String str = "Java is very easy";

        /*
         * If we want to convert a String to a StringBuilder, we can use the below syntax.
         */

        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        /*
         * If we want to convert a StringBuilder to a String, we can use the below syntax.
         */

        String newStr = stringBuilder1.toString();
        System.out.println("newStr = " + newStr);

    }

}
