package Class21;

public class Class20_HW1_Area_Review {

     /* Create 1 class in which create methods that will calculate the area (volume in case of box) of:
        Rectangle
        Square
        Box
        Use separate class to test your code
    */

    public static void main(String[] args) {
        AreaManager areaManager = new AreaManager();
        areaManager.calculateArea(10);
        areaManager.calculateArea(10,12);
    }
}

class AreaManager{

    void calculateArea(double len, double wid)
    {
        System.out.println(len*wid);
    }

    void calculateArea(double len)
    {
        System.out.println(len * len);
    }

    void calculateVolume(double len, double height, double wid)
    {
        System.out.println(len*wid*height);
    }
}