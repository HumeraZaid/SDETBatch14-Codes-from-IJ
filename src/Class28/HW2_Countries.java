package Class28;

import java.util.*;

public class HW2_Countries {

    /* Create a map of countries with its capital that will store countries in alphabetical order.
       Print all keys and values from a country map using for each loop and iterator.
       Print all values from a country map using for each loop and iterator.
     */

    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington D.C.");
        countries.put("India", "New Delhi");
        countries.put("UK", "London");
        countries.put("Saudi Arabia", "Riyadh");
        countries.put("UAE", "Abu Dhabi");
        countries.put("Canada", "Ottawa");


        System.out.println("All key-value pairs using for each loop:");
        Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        for(Map.Entry<String, String> entry : entrySet)
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println();

        System.out.println("All key-value pairs using iterator:");
        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println();

        System.out.println("All keys using for each loop:");
        Collection<String> keys = countries.keySet();
        for(String key : keys)
        {
            System.out.print(key + " ");
        }

        System.out.println("\n");

        System.out.println("All keys using iterator:");
        Iterator<String> keyIterator = keys.iterator();
        while(keyIterator.hasNext())
        {
            System.out.print(keyIterator.next() + " ");
        }

        System.out.println("\n");

        System.out.println("All values using for each loop:");
        Collection<String> values = countries.values();
        for(String value : values)
        {
            System.out.print(value + " ");
        }

        System.out.println("\n");

        System.out.println("All values using iterator:");
        Iterator<String> valueIterator = values.iterator();
        while(valueIterator.hasNext())
        {
            System.out.print(valueIterator.next() + " ");
        }

    }
}
