package ReviewClass11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListsDemo {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");  // When we use the simple add method (that takes one parameter), elements are added in the end of the list
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");


        // How to print the ArrayList as is?
        System.out.println(animals);

        // How to print the size of each word from the list?
        for(String animal : animals)
        {
            System.out.println(animal.length());
        }

        // How to remove words which have more than 4 letters from the list?
        // animals.removeIf(x -> x.length() > 4);
        // System.out.println(animals);

        /* If an element is more than 4 letters, we want to replace that with Camel
           1. We should not use an iterator here because we are not performing any operation that can change the size of the list.
           2. We should not enhanced for loop here as we are not just printing the data; we are updating the data.
           3. We should use a regular for loop here as we need the index to update the data.
         */

        for(int i=0; i < animals.size(); i++)
        {
            if(animals.get(i).length() > 4)
            {
                animals.set(i, "Camel"); // set method replaces the elements
            }
        }

        System.out.println(animals);

        System.out.println(animals.subList(0, 3));
        ListIterator<String> stringListIterator = animals.listIterator();
        while(stringListIterator.hasNext())
        {
            System.out.println(stringListIterator.next());
        }

    }

}
