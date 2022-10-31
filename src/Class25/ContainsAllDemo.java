package Class25;

import java.util.ArrayList;

public class ContainsAllDemo {

    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("Eyeliner");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");

        System.out.println(beautyProducts.contains("Lipstick"));
        System.out.println(beautyProducts.contains("Mascara"));
        System.out.println(beautyProducts.contains("Eyeliner"));

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        System.out.println(beautyProducts.containsAll(cosmetics));
    }
}

