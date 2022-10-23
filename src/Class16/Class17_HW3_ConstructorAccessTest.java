package Class16;

import Class17.HW3_ConstructorAccess;

public class Class17_HW3_ConstructorAccessTest {
    public static void main(String[] args) {
        // HW3_ConstructorAccess a1 = new HW3_ConstructorAccess(3.5); // private constructor, so cannot be accessed from a different package.
        // a1.calculateArea1();
        HW3_ConstructorAccess a2 = new HW3_ConstructorAccess(4, 5); // public constructor with public method, so can be accessed from a different package.
        a2.calculateArea2();
        // HW3_ConstructorAccess a3 = new HW3_ConstructorAccess(); // default constructor, so cannot be accessed from a different package.
        // a3.calculateArea3();
        // HW3_ConstructorAccess a4 = new HW3_ConstructorAccess(6); // protected constructor, so cannot be accessed from a different package.
        // a4.calculateArea4();
    }

}
