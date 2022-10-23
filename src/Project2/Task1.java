package Project2;

public interface Task1 {

    /* Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
       Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
       Test your code.
     */

    public static void main(String[] args) {

        Shape circle = new Circle(2.5);
        circle.calculateArea();
        circle.calculatePerimeter();

        Shape square = new Square(3.5);
        square.calculateArea();
        square.calculatePerimeter();
    }
}

interface Shape{

    void calculateArea();
    void calculatePerimeter();

}

class Circle implements Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea()
    {
        System.out.println("Area of the circle is " + Math.PI * Math.pow(radius, 2));
    }

    public void calculatePerimeter()
    {
        System.out.println("Perimeter of the circle is " + (2 * Math.PI * radius));
    }
}


class Square implements Shape{

    double side;

    public Square(double side){
        this.side = side;
    }

    public void calculateArea()
    {
        System.out.println();
        System.out.println("Area of the square is " + Math.pow(side, 2));
    }

    public void calculatePerimeter()
    {
        System.out.println("Perimeter of the square is " + (4 * side));
    }


}
