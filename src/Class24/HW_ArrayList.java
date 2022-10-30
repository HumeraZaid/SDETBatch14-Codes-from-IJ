package Class24;

import java.util.ArrayList;

public class HW_ArrayList {

    /* Create an ArrayList that will store 5 names into it.
       Find out whether the given ArrayList is empty or not?
       Check whether the specific name is present in an ArrayList or not?
       Find the size of your arrayList and print all values from that
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maryam");
        names.add("Sarah");
        names.add("Zahra");
        names.add("Iqra");
        names.add("Muhammad Shahzain");
        names.add("Fatima");

        if(names.isEmpty()) {
            System.out.println("This ArrayList is empty.");
        }
        else
        {
            System.out.println("This ArrayList is not empty.");
        }

        System.out.println();

        if(names.contains("Zahra"))
        {
            System.out.println("This ArrayList contains the name Zahra.");
        }
        else
        {
            System.out.println("This ArrayList does not contain the name Zahra.");
        }

        System.out.println();

        System.out.println("Size of this ArrayList is: " + names.size());

        System.out.println();

        System.out.println("The elements in this ArrayList are: " + names);

    }
}
