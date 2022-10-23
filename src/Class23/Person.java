package Class23;

public interface Person {
    void eat();
}

interface Employee{
    void work();
}

interface SyntaxEmployee extends Employee, Person{
    void createRepl();
}

class Asghar implements SyntaxEmployee{
    public void eat()
    {
        System.out.println("Like to eat grilled fish");
    }

    public void work()
    {
        System.out.println("Teaches Batch14");
    }

    public void createRepl()
    {
        System.out.println("Create easy Repls");
    }
}

