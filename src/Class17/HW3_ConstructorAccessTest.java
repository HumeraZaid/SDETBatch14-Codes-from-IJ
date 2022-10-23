package Class17;

public class HW3_ConstructorAccessTest {
    public static void main(String[] args) {
        // HW3_ConstructorAccess a1 = new HW3_ConstructorAccess(3.5); // private constructor, so cannot be accessed from a different class.
        // a1.calculateArea1();
        HW3_ConstructorAccess a2 = new HW3_ConstructorAccess(4, 5);
        a2.calculateArea2();
        HW3_ConstructorAccess a3 = new HW3_ConstructorAccess();
        a3.calculateArea3();
        HW3_ConstructorAccess a4 = new HW3_ConstructorAccess(6);
        a4.calculateArea4();
    }
}
