package Class14;

import java.util.Scanner;

public class HW1_LargerNumber {

    /*
      Create a method that will take 2 parameters as numbers and print which number is larger.
     */

    void largerNumber(int num1, int num2)
    {
        if(num1>num2)
        {
            System.out.println("Larger number from " + num1 + " and " + num2 + " is " +num1 + ".");
        }
        else {
            System.out.println("Larger number from " + num1 + " and " + num2 + " is " +num2 + ".");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int num1 = inp.nextInt();
        System.out.println("Please enter the first number:");
        int num2 = inp.nextInt();

        HW1_LargerNumber ln = new HW1_LargerNumber();
        ln.largerNumber(num1, num2);
    }
}
