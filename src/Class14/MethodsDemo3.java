package Class14;

import java.util.Scanner;

public class MethodsDemo3 {

    boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        MethodsDemo3 md = new MethodsDemo3();
        if(md.isEven(5))
        {
            System.out.println("Number is even.");
        }
        else
        {
            System.out.println("Number is odd");
        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

    }
}
