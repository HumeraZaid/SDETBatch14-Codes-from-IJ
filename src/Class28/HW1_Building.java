package Class28;

import java.util.HashMap;

public class HW1_Building {

    /* Create a map of a building.
       Store floor number and its associated company name.
       (Example: 1= Google, 2=Syntax etc..).
       Insert 7 entries with duplicate keys and values.
       Check how many entries you have?
       Update company on a 4th floor.
       Remove company on the 7th floor.
       Print your map.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(5, "IBM");
        building.put(4, "Syntax");
        building.put(5, "Microsoft");
        building.put(1, "Capgemini");
        building.put(7, "Deloitte");

        System.out.println("Number of entries is: " + building.size() + "\n");
        System.out.println("Original building: \n" + building + "\n");


        building.replace(4, "Apple");
        System.out.println("Building after updating company on the 4th floor: \n" + building + "\n");


        building.remove(7);
        System.out.println("Building after removing the 7the floor: \n" + building + "\n");

    }
}
