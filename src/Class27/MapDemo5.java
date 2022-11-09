package Class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {

    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        Collection<Double> values = fruit.values(); // Returns all the values from a map

        Iterator<Double> iterator = values.iterator();

        while(iterator.hasNext())
        {
            Double value = iterator.next();
            if(value > 2)
            {
                iterator.remove();
            }
        }

        System.out.println(fruit);

        /*
        This will give same result as code from line 16 to line 29

        fruit.values().removeIf(x -> x > 2);
        System.out.println(fruit);
         */
    }
}
