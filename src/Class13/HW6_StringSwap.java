package Class13;

public class HW6_StringSwap {
    public static void main(String[] args) {

        /*
         * How would you swap  2 strings without a temporary variable?
         */

        String a = "Breathe";
        String b = "Deeply";

        System.out.println("Before swapping:");
        System.out.println("String 1 = " + a);
        System.out.println("String 2 = " + b);

        a = a + b;
        b = a.substring(0, (a.length()-b.length()));
        a = a.substring(b.length());

        System.out.println();

        System.out.println("After swapping:");
        System.out.println("String 1 = " + a);
        System.out.println("String 2 = " + b);

        System.out.println("----------------------------------");
        System.out.println("Second way to do it:");

        String c = "You";
        String d = "Can";

        System.out.println("Before swapping:");
        System.out.println("String 1 = " + c);
        System.out.println("String 2 = " + d);

        c = c + d;
        d = c.replace(d, "");
        c = c.replace(d, "");

        System.out.println();

        System.out.println("After swapping:");
        System.out.println("String 1 = " + c);
        System.out.println("String 2 = " + d);

    }


}
