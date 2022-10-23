package Class14;

import java.util.Scanner;

public class HW2_EvenOrOdd {

    /*
      Create a method that will take a number and print whether the number is even or odd.
     */

    void isOdd(int num)
    {
        if(num%2!=0)
        {
            System.out.println(num + " is an odd number.");
        }
        else {
            System.out.println(num + " is an even number.");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = inp.nextInt();

        HW2_EvenOrOdd eo = new HW2_EvenOrOdd();
        eo.isOdd(num);
    }

}
