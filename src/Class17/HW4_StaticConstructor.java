package Class17;

public class HW4_StaticConstructor {

    /*
       Write program that have static constructor and observe result.
     */

    private String make;
    private String model;
    private int year;
    private String color;

    static HW4_StaticConstructor(String carMake, String carModel, int carYear, String carColor)
    {
        make = carMake;
        model = carModel;
        year = carYear;
        color = carColor;
    }

    void print()
    {
        System.out.println("We had a " + make + " " + model + " " + " of " + color +
                " color in the year" + year + ".");
    }

    public static void main(String[] args) {
        HW4_StaticConstructor car = new HW4_StaticConstructor("Mercedes", "C300",2018,"Blue" );

    }
}
