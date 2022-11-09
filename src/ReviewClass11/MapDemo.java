package ReviewClass11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapDemo {

    public static void main(String[] args) {

        /*
           HashMap: Does not retain the order, but it is fastest.
           LinkedHasMap: It retains the order, but it is a little slower than HashMap.
           TreeMap: It sorts the data, but it is slowest.
         */

        Map<String, Double> vegList = new LinkedHashMap<>();
        TreeSet<String> hashSet = new TreeSet<>();
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
