package Class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("Eyeliner");
        makeUpItem.add("Lipstick");

        ArrayList<String> itemsToBeRemoved = new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("Concealer");
        itemsToBeRemoved.add("Josh");

        makeUpItem.removeAll(itemsToBeRemoved); // removes the specified list
        System.out.println(makeUpItem);
        makeUpItem.clear(); // removes everything
        System.out.println(makeUpItem);
    }
}
