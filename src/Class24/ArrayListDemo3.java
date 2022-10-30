package Class24;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        /*
            How to store chars in ArrayList?
            ArrayList<Character> chars = new ArrayList<>(new ArrayList<>(Arrays.asList('E','F')));
         */

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');

        System.out.println(chars);

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(12.5F);
        floats.add(12F);
        System.out.println(floats);
    }
}
