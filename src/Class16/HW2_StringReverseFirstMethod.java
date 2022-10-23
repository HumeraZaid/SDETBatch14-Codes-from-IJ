package Class16;

public class HW2_StringReverseFirstMethod {

    /*
       Create a method that will take a String as a parameter and
       returns reversed String. Method should be available to all classes within your
       project and accessible by class name.
     */

    public String stringReverse(String a)
    {
        StringBuilder b = new StringBuilder(a);
        String c = b.reverse().toString();
        return c;
    }

    public static void main(String[] args) {
        HW2_StringReverseFirstMethod d = new HW2_StringReverseFirstMethod();
        System.out.println("Zaid Humera Zahra");
        System.out.println(d.stringReverse("Zaid Humera Zahra"));
    }
}
