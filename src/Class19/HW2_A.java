package Class19;

public class HW2_A {

    /* Write program to inherit class A that has method printF which is static and
       call or reuse that method into class B.
     */

    static void printF()
    {
        System.out.println("The printF() method is a static method of the super class.");
    }
}

class HW2_B extends HW2_A{
    public static void main(String[] args) {
        HW2_B.printF();
    }
}
