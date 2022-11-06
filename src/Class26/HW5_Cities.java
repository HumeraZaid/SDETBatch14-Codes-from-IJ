package Class26;

import java.util.TreeSet;

public class HW5_Cities {

    /* Create a Set of cities in which you want to make sure that insertion order is maintained.
       Then remove any city that starts with “A”.
     */

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mecca");
        treeSet.add("Paris");
        treeSet.add("London");
        treeSet.add("New York");
        treeSet.add("Austin");
        treeSet.add("Istanbul");
        treeSet.add("Chicago");
        treeSet.add("Dubai");
        treeSet.add("Abu Dhabi");
        treeSet.add("Mumbai");
        treeSet.add("Amsterdam");
        treeSet.add("Karachi");
        treeSet.add("Tokyo");
        treeSet.add("Bangkok");
        System.out.println("Original Set:");
        System.out.println(treeSet);

        System.out.println();

        treeSet.removeIf(x -> x.startsWith("A"));
        System.out.println("Set after removing cities that start with \"A\" :");
        System.out.println(treeSet);
    }
}

