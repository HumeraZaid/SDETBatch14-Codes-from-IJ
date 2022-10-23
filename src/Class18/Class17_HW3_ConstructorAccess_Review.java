package Class18;

public class Class17_HW3_ConstructorAccess_Review {

    /*
      Write a java class that have 4 constructors with 4 different access levels of constructors
      (private,public,default,protected) and create 4 objects of this class:
      1 - inside same class;
      2 - from outside the class;
      3 - from different class inside different package and observe result.
     */

    private Class17_HW3_ConstructorAccess_Review()
    {
        System.out.println("private");
    }

    Class17_HW3_ConstructorAccess_Review(String name)
    {
        System.out.println("default");
    }

    protected Class17_HW3_ConstructorAccess_Review(int age)
    {
        System.out.println("protected");
    }

    Class17_HW3_ConstructorAccess_Review(boolean isTrue)
    {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Class17_HW3_ConstructorAccess_Review();
        new Class17_HW3_ConstructorAccess_Review("Thank you Lubna");
        new Class17_HW3_ConstructorAccess_Review(10);
        new Class17_HW3_ConstructorAccess_Review(true);
    }
}
