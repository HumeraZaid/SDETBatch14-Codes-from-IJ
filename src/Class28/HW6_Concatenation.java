package Class28;

import java.util.LinkedHashSet;

public class HW6_Concatenation {

    /* Create the collection that will store single unique objects of a String type
       in which order is preserved.
       Write a logic to concatenate all string from the collection.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> objects = new LinkedHashSet<>();
        objects.add("Keep");
        objects.add("calm");
        objects.add("and");
        objects.add("learn");
        objects.add("Java!!");

        for(String object : objects)
        {
            System.out.print(object + " ");
        }
    }
}
