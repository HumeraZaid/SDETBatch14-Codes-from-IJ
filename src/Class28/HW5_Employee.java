package Class28;

import java.util.HashMap;
import java.util.Set;

public class HW5_Employee {

    /* Create a Map that will store Employee name and salary.
       Write a logic to retrieve an employee who gets the highest salary.
       Output should be in the below format:
       John Smith=$100000
     */

    public static void main(String[] args) {

        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Maryam", 250000);
        employee.put("Sarah", 280000);
        employee.put("Zahra", 300000);
        employee.put("Iqra", 245000);
        employee.put("Fatima", 265000);

        int v = 0;
        String k = "";
        Set<String> keys = employee.keySet();
        for(String key : keys)
        {
            if(employee.get(key) > v)
            {
                v = employee.get(key);
                k = key;
            }
        }
        System.out.println(k + "=" + v);
    }
}
