package Class19;

public class HW5_Shape {

    /* Write program: Shape class has a constructor that takes the radius and has a subclass as
       circle class. In circle class create a method to calculate the area of circle. Test your code.
     */

    double radius;

    public HW5_Shape(double radius) {
        this.radius = radius;
    }
}

class HW5_Circle extends HW5_Shape{

    public HW5_Circle(double radius) {
        super(radius);
    }

    public void calculateArea()
    {
        double area;
        area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area + " sq. cms.");
    }
}

class HW5_Test{
    public static void main(String[] args) {
        HW5_Circle obj = new HW5_Circle(5);
        obj.calculateArea();
    }
}
