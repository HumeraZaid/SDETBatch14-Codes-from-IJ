package Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {

    public static void main(String[] args) {

        // There are three types of sets - HashSet, LinkedHashSet, TreeSet

        /*
            HashSet:
            Upside --> It is the fastest type of set
            Downside --> HashSet does not care about the insertion order
         */

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet");
        System.out.println(hashSet);

        /*
            LinkedHashSet:
            Upside --> LinkedHashSet cares about the insertion order. Values are retrieved in the same order as they are inserted.
            Downside --> Insertion speed of LinkedHastSet is same as HashSet, but retrieval speed is the worst
         */

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);

        // TreeSet retrieves values in their natural/alphabetical/sorted order. Whenever you need sorted data, use TreeSet.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet");
        System.out.println(treeSet);
    }
}
