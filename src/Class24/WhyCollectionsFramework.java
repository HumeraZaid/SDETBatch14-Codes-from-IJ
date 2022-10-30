package Class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {

    public static void main(String[] args) {

        /*
            If we have to store a single value, we should use variables.
         */

        String name = "Josh";
        String name2 = "Joe";
        System.out.println(name);
        System.out.println(name2);

        /*
            If we have to store more than two values of same kind, then we should go with arrays.
         */

        String[] names = {"Reshad", "Adam", "Again Josh"};

        /*
            Fixed in size.
         */

        String[] breeds = new String[10];
        breeds[0] = "BullDogs";
        System.out.println(Arrays.toString(breeds));

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);
    }
}
