package Class17;

import java.util.Scanner;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee josh = new Employee("Josh", "IT", 120000, 25);
        josh.printSalary();
        josh.calculatePrintTax();

        /*
           Below we have more constructor calls.
         */

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("str");
        String str = new String ("value");

    }
}
