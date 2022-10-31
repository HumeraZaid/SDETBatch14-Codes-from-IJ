package Class25;

import java.util.ArrayList;

public class Class24_HW1_ArrayList {

    /* Create an ArrayList that will store 5 names into it.
       Find out whether the given ArrayList is empty or not?
       Check whether the specific name is present in an ArrayList or not?
       Find the size of your arrayList and print all values from that
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nesrin");
        names.add("Vidya");
        names.add("Jam");
        names.add("Jamo");
        names.add("Jami");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jam"));
        System.out.println(names.contains("Dam"));
        System.out.println(names.size());
        System.out.println(names);
    }

}
