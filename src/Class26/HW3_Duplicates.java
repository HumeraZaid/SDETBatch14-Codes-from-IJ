package Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW3_Duplicates {

    /* How can you remove all duplicates from ArrayList?
       List<String> aList=new ArrayList<>();
       aList.add("John");
       aList.add("Jane");
       aList.add("James");
       aList.add("Jasmine");
       aList.add("Jane");
       aList.add("James");
     */

    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println("Original ArrayList:");
        System.out.println(aList);

        System.out.println();

        HashSet<String> hashSet = new HashSet<>(aList);
        System.out.println("ArrayList after removing duplicates:");
        System.out.println(hashSet);
    }

}
