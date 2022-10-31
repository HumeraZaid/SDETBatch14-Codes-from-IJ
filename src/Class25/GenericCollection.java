package Class25;

import java.util.ArrayList;

public class GenericCollection {

    public static void main(String[] args) {

        /*
          Non-generic way of using collections framework. This is how your ancestors use to write code before Java.
          1.5 it causes a lot of problems at runtime because Java doesn't know at compile time what type of data
          you are storing in this class, and because Java does not know, it cannott help you avoid these errors.
         */

        ArrayList names = new ArrayList();
        names.add("Serhi");
        names.add(10);
        System.out.println(names);
        System.out.println(((String)names.get(0)).length());
    }
}
