package Class16;

public class HW2_StringReverseSecondMethod {

    /*
       Create a method that will take a String as a parameter and
       returns reversed String. Method should be available to all classes within your
       project and accessible by class name.
     */

    public String stringReverse(String a)
    {
        String str = "";
        for(int i = a.length()-1;i>=0;i-- )
        {
            str=str+a.charAt(i);
        }
        return str;

    }

    public static void main(String[] args) {
        HW2_StringReverseSecondMethod b = new HW2_StringReverseSecondMethod();
        System.out.println("Zaid Humera Zahra");
        System.out.println(b.stringReverse("Zaid Humera Zahra"));


    }
}
