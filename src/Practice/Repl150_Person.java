package Practice;

public class Repl150_Person {

    String name;
    String lastName;
    int age;

    public Repl150_Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}

class Repl150_Employee extends Repl150_Person{

    int salary;

    public Repl150_Employee(String name, String lastName, int age, int salary){
        super(name, lastName, age);
        this.salary = salary;
    }

    public void printMethod1()
    {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}

class Repl150_Student extends Repl150_Person{

    int grade;

    Repl150_Student(String name, String lastName, int age, int grade){
        super(name, lastName, age);
        this.grade = grade;
    }

    public void printMethod2()
    {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}

class Repl150_Retiree extends Repl150_Person{

    String seniorActivity;

    public Repl150_Retiree(String name, String lastName, int age, String seniorActivity){
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;
    }

    public void printMethod3()
    {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}

class Repl150_Test{
    public static void main(String[] args) {
        Repl150_Employee obj1 = new Repl150_Employee("Joe", "Smith", 35, 35000);
        obj1.printMethod1();

        Repl150_Student obj2 = new Repl150_Student("Adam", "Smith", 15, 10);
        obj2.printMethod2();

        Repl150_Retiree obj3 = new Repl150_Retiree("Frank", "Smith", 15, "tour");
        obj3.printMethod3();

    }
}




