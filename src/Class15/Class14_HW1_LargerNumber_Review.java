package Class15;

import java.util.Scanner;

public class Class14_HW1_LargerNumber_Review {

    /*
      Create a method that will take 2 parameters as numbers and print which number is larger.
     */

    void printLarger(int num1, int num2)
    {
        if(num1>num2)
        {
            System.out.println("Number 1 is larger " + num1);
        } else if (num2>num1)
        {
            System.out.println("Number 2 is larger " + num2);
        }
        else
        {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int number2 = scanner.nextInt();

        Class14_HW1_LargerNumber_Review HW1 = new Class14_HW1_LargerNumber_Review();
        HW1.printLarger(number1, number2);
        HW1.printLarger(50,12);

    }
}
