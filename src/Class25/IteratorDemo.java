package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("Eyeliner");

        Iterator<String> iterator = beautyProducts.iterator(); // Get the iterator from the list
        System.out.println(iterator.hasNext());  // We have one item
        System.out.println(iterator.next()); // It gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());

        while ((iterator.hasNext()))
        {
            System.out.println(iterator.next());
        }

    }
}
