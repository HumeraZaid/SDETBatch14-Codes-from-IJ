package Class25;

import java.util.ArrayList;

public class IteratorDemo4_WithLambda {

    public static void main(String[] args) {

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");

        beautyProducts.removeIf(x -> x.startsWith("B")); // Lambda expression
        System.out.println(beautyProducts);

    }

}
