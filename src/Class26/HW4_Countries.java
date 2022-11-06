package Class26;

import java.util.ArrayList;
import java.util.TreeSet;

public class HW4_Countries {

    /* Create a Set collection in which you need to add names of the countries.
       In this set, we want all objects to be sorted in alphabetical order.
       Using 2 different ways, retrieve all elements from set.
     */

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Greece");
        treeSet.add("India");
        treeSet.add("Russia");
        treeSet.add("USA");
        treeSet.add("France");
        treeSet.add("Pakistan");
        treeSet.add("Ukraine");
        System.out.println("First way to retrieve all elements from the set:");
        System.out.println(treeSet);

        System.out.println();

       ArrayList<String> arrayList = new ArrayList<>(treeSet);

        System.out.println("Second way to retrieve all elements from the set:");

        for(int i=0; i<arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i) + " ");
        }

    }
}
