package Class20;

public class HW1_Area {

    /* Create 1 class in which create methods that will calculate the area (volume in case of box) of:
       Rectangle
       Square
       Box
       Use separate class to test your code
    */

    static void calculateArea(int length, int width)
    {
        System.out.println("Area of the rectangle is " + (length*width) + " sq. cms.");
    }

    static void calculateArea(int side)
    {
        System.out.println("Area of the square is " + (side*side) + " sq. cms.");
    }

    static void calculateVolume(int length, int width, int height)
    {
        System.out.println("Volume of the box is " + (length*width*height) + " cubic mtrs.");
    }

}


