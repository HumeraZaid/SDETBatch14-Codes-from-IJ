package Class16;

public class SyntaxEmployeeTester {

    public static void main(String[] args) {
        SyntaxEmployee asgharEmp = new SyntaxEmployee();
        asgharEmp.empID = "123";
        asgharEmp.salary = 100000;
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee moazzamEmp = new SyntaxEmployee();
        moazzamEmp.empID = "123";
        moazzamEmp.salary = 100000;
        System.out.println(SyntaxEmployee.CEO);
    }
}
