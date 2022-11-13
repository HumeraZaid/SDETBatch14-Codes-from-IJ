package Class28;

import java.util.LinkedList;

public class HW7_Integers {

    /* Create a collection of integers in which you can keep duplicates.
       Write a logic to find sum of all integers.
     */

    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);

        int sum = 0;
        for(int integer : integers)
        {
            sum+=integer;
        }
        System.out.println("Sum of all integers is: " + sum);
    }
}
