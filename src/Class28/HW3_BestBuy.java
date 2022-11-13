package Class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW3_BestBuy {

    /* Create a map of Best Buy store.
       Place item id and item name into it.
       Example (7664847 = Printer, 7879885= TV etc ).
       Retrieve all keys and values from a Best Buy map using EntrySet.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(7312432, "Washer");
        bestBuy.put(7356779, "Laptop");
        bestBuy.put(7356779, "Dishwasher");
        bestBuy.put(7253600, "Dryer");
        bestBuy.put(7904235, "Microwave");
        bestBuy.put(7233545, "Refrigerator");

        Set<Map.Entry<Integer, String>> items = bestBuy.entrySet();
        for(Map.Entry<Integer, String> item : items)
        {
            System.out.println(item.getKey() + " = " + item.getValue());
        }
    }

}
