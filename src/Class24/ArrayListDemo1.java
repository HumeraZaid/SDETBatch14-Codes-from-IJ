package Class24;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();  // Syntax to create an ArrayList
        colors.add("Red");  // Use add method to insert elements in an ArrayList
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors); // Prints all the elements

        System.out.println(colors.get(0)); // get method prints individual elements from Arraylist

        System.out.println(colors.get(2));

        System.out.println(colors.size()); // size method prints the length of the ArrayList

        for(int i=0; i<colors.size(); i++) // Getting all the elements through normal loop
        {
            System.out.println(colors.get(i));
        }

        System.out.println("----------------");

        for(String color : colors)
        {
            System.out.println(color); // Getting all the elements through enhanced loop
        }
    }
}
