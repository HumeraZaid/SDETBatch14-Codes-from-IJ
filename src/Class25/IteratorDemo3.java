package Class25;

import java.util.ArrayList;

public class IteratorDemo3 {

    public static void main(String[] args) {

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");

       /*
        Java 11 and further feature:
        var number = 10;
        var name = "Tymur";
        var decimalNumber = 21.5;
        */

        var iterator = beautyProducts.iterator();
        while(iterator.hasNext())
        {
            var item = iterator.next();
            if(item.startsWith("B") || item.endsWith("a"))  // deletes all the products which start with letter B or ends with letter a
            {
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }

}
