package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
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
        // beautyProducts.add("Eyeliner");

        Iterator<String> iterator = beautyProducts.iterator();
        System.out.println(beautyProducts.size());

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }

        System.out.println(beautyProducts);
    }

}
