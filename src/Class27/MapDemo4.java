package Class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);  // Stores the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        Set<String> allKeys = fruit.keySet();  // Getting all the keys in the form of a set
        System.out.println(allKeys);

       /*
        Iterator<String> iterator = allKeys.iterator(); // Getting an iterator on that set
        while(iterator.hasNext())
        {
            String item = iterator.next();
            if(item.contains("n"))
            {
                iterator.remove();
            }
        }
        */

       fruit.keySet().removeIf(x -> x.contains("n")); // Using the lambda expression

        System.out.println(fruit);
    }
}
