package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
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

        Iterator<String> iterator = beautyProducts.iterator();
        while (iterator.hasNext())
        {
            // String item = iterator.next(); // Better approach to store in a variable
            if(iterator.next().endsWith("r"))
            {
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }

}
