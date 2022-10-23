package Practice;

public class Repl146 {

    private String name;
    private String lastName;
    private int empID;
    private String startDate;
    private int salary;

    public Repl146() {

    }

    public Repl146(String name, String lastName, int empID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.empID = empID;
        this.startDate = startDate;
        this.salary = salary;
    }

    void printMethod()
    {
        System.out.println(name + " " + lastName + " " + empID + " " + startDate + " " + salary);
    }
}

class Repl146_Test{
    public static void main(String[] args) {
        new Repl146().printMethod();
        new Repl146("Joe", "Smith", 12345, "01/01/1970", 35000).printMethod();
    }
}
