package Class17;

public class HW3_ConstructorAccess {

    /*
      Write a java class that have 4 constructors with 4 different access levels of constructors
      (private,public,default,protected) and create 4 objects of this class:
      1 - inside same class;
      2 - from outside the class;
      3 - from different class inside different package and observe result.
     */

     double radius;
     int base;
     int height;
     int side;
     double area1;
     double area2;
     int area3;


    private HW3_ConstructorAccess(double r)
    {
        radius = r;
        area1 = 3.14*r*r;
    }

    public HW3_ConstructorAccess(int b, int h)
    {
        base = b;
        height = h;
        area2 = 0.5*b*h;
    }

    HW3_ConstructorAccess()
    {

    }

    protected HW3_ConstructorAccess(int s)
    {
        side = s;
        area3 = s*s;
    }

    void calculateArea1()
    {
        System.out.println("The area of circle is " + area1 + " sq. cms.");
    }

    public void calculateArea2()
    {
        System.out.println("The area of triangle is " + area2 + " sq. cms.");
    }

    void calculateArea3()
    {

    }

    void calculateArea4()
    {
        System.out.println("The area of square is " + area3 + " sq. cms.");
    }

    public static void main(String[] args) {
        HW3_ConstructorAccess a1 = new HW3_ConstructorAccess(3.5);
        a1.calculateArea1();

        HW3_ConstructorAccess a2 = new HW3_ConstructorAccess(4, 5);
        a2.calculateArea2();

        HW3_ConstructorAccess a3 = new HW3_ConstructorAccess();
        a3.calculateArea3();

        HW3_ConstructorAccess a4 = new HW3_ConstructorAccess(6);
        a4.calculateArea4();
    }



}
