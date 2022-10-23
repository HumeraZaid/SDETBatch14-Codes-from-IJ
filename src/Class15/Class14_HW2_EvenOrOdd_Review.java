package Class15;

public class Class14_HW2_EvenOrOdd_Review {

    /*
      Create a method that will take a number and print whether the number is even or odd.
     */

    void printEvenOdd(int number)
    {
        if(number%2==0)
        {
            System.out.println(number + " is Even");
        }
        else
        {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        Class14_HW2_EvenOrOdd_Review HW2 = new Class14_HW2_EvenOrOdd_Review();
        HW2.printEvenOdd(45);
        HW2.printEvenOdd(50);
    }
}
