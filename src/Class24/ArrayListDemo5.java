package Class24;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
        // colors.remove("Blue"); // removes the specified value
        colors.remove(2);  // removes the value at the specified index
        System.out.println(colors);
    }
}

