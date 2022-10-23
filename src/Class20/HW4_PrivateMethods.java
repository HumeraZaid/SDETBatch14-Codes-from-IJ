package Class20;

public class HW4_PrivateMethods {

    /* Create 1 class with a private method that has 3 overloaded forms.
       Then call each overloaded method with specific arguments and observe result.
     */

    private void phone(String make, String model)
    {
        System.out.println("The recently launched phone is " + make + " " + model + ".");
    }

    private void phone(String make, String model, String color)
    {
        System.out.println("The new color available in " + make + " " + model + " is " + color + ".");
    }

    private void phone(String make, String model, int space, double price)
    {
        System.out.println("The storage capacity of " + make + " " + model + " is " + space +
                          "TB and the price is $" +  price + ".");
    }

    public static void main(String[] args) {
        HW4_PrivateMethods phone = new HW4_PrivateMethods();
        phone.phone("Apple", "iPhone 14 Pro Max");
        phone.phone("Apple", "iPhone 14 Pro Max", "Deep Purple");
        phone.phone("Apple", "iPhone 14 Pro Max", 1, 1698.94);

    }
}
