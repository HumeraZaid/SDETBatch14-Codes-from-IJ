package Class12;

import java.util.Scanner;

public class HW3_BabyShower {
    public static void main(String[] args) {

        /*
         * Write a program that reads two people's firstnames and if they expecting boy or girl?
         * Based on the input, suggests a name for a baby:
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? boy
         * Suggested baby name: DANRY
         *
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? girl
         * Suggested baby name: MAIEL
         */

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the Mom's first name.");
        String momFirstName = inp.next();

        System.out.println("Please enter the Dad's first name.");
        String dadFirstName = inp.next();

        System.out.println("Please enter the gender of the baby.");
        String gender = inp.next();

        if(gender.equalsIgnoreCase("boy"))
        {
            System.out.println(dadFirstName.substring(0,dadFirstName.length()/2).toUpperCase() +
                    momFirstName.substring(momFirstName.length()/2).toUpperCase());
        }
        else if(gender.equalsIgnoreCase("girl"))
        {
            System.out.println(momFirstName.substring(0,momFirstName.length()/2).toUpperCase() +
                    dadFirstName.substring(dadFirstName.length()/2).toUpperCase());
        }


    }


}
