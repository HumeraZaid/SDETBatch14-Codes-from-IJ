package Class13;

import java.util.Scanner;

public class HW5_Palindrome {
    public static void main(String[] args) {

        /*
         * How would you check if String is palindrome or not?
         * aba=> true
         * Abbc =>false
         */

        System.out.println("First way to do it:");

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String str1 = inp.next();

        String str2 = "";

        for(int i=str1.length()-1; i>=0; i--)
        {
            str2 = str2 + str1.charAt(i);

        }

        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Your string is a palindrome string.");
        }
        else
        {
            System.out.println("Your string is not a palindrome string.");
        }

        System.out.println("----------------------------------------");
        System.out.println("Second way to do it:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");

        String userInput = scanner.next();
        StringBuilder str3 = new StringBuilder(userInput);
        str3.reverse();

        if(userInput.equalsIgnoreCase(str3.toString()))
        {
            System.out.println("Your string is a palindrome string.");
        }
        else
        {
            System.out.println("Your string is not a palindrome string.");
        }


        System.out.println("----------------------------------------");
        System.out.println("Third way to do it:");


        StringBuilder a = new StringBuilder("mom");
        String b = a.toString();
        a.reverse();
        String c = a.toString();

        if(c.equals(b))
        {
            System.out.println("Your string is a palindrome string.");
        }
        else
        {
            System.out.println("Your string is not a palindrome string.");
        }


        System.out.println("----------------------------------------");
        System.out.println("Fourth way to do it:");

        String a1 = "test";
        StringBuilder b1 = new StringBuilder(a);

        if(a1.equalsIgnoreCase(b1.reverse().toString()))
        {
            System.out.println("Your string is a palindrome string.");
        }
        else
        {
            System.out.println("Your string is not a palindrome string.");
        }

    }

}
