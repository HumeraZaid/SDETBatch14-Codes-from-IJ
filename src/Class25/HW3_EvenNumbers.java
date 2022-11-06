package Class25;

import java.util.ArrayList;

public class HW3_EvenNumbers {

    /* Create an ArrayList of even numbers from 1 to 500.
       Remove any number that is divisible by 5 from that ArrayList.
     */

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        for(int i=0; i<=500; i+=2)
        {
                num.add(i);
        }
        System.out.println("ArrayList with even numbers from 1 to 500:");
        System.out.println(num);

        var iterator = num.iterator();
            while(iterator.hasNext()) {
                Integer j = iterator.next();
                if (j % 5 == 0) {
                    iterator.remove();
                }
            }
        System.out.println();
        System.out.println("ArrayList after removing numbers divisible by 5:");
        System.out.println(num);
    }
}
