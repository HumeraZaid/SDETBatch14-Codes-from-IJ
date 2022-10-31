package Class25;

import java.util.ArrayList;

public class HW2_Drinks {

    /* Create an arrayList of drinks.
       If any drink has letter “a” or “e” replace it with water.
     */

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Crush");
        drinks.add("Lemonade");
        drinks.add("Canada Dry");
        drinks.add("Pepsi");
        drinks.add("Mountain Dew");
        drinks.add("Sunkist");
        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Mirinda");
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Milk");

        System.out.println("Original ArrayList:");
        System.out.println(drinks);

        System.out.println();

        int i = 0;

        var iterator = drinks.iterator();
        while(iterator.hasNext())
        {
            String drink = iterator.next();
            if(drink.contains("a") || drink.contains("e"))
            {
                drinks.set(i,"Water");
            }
            i++;
        }

        System.out.println("ArrayList after replacement:");
        System.out.println(drinks);
    }
}
