package Class25;

import java.util.ArrayList;

public class HW1_Words {

    /* Create an arrayList of words.
       Remove every word that ends with “e”.
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Greece");
        words.add("India");
        words.add("Palestine");
        words.add("USA");
        words.add("France");
        words.add("Pakistan");
        words.add("Ukraine");

        System.out.println("Original ArrayList:");
        System.out.println(words);

        System.out.println();

        System.out.println("ArrayList without countries ending with the letter \"e\": ");

        var iterator = words.iterator();
        while ((iterator.hasNext()))
        {
            String word = iterator.next();
            if (word.endsWith("e"))
            {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
