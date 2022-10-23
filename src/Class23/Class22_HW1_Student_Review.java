package Class23;

public class Class22_HW1_Student_Review {

    /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
       Define common behavior within parent class and override some of the methods in child classes.
       Define some methods specific to child classes.
       Write example of achieving run time polymorphism.
     */
}

class Student{
    void study()
    {
        System.out.println("Students must study");
    }

    void doHomeWork()
    {
        System.out.println("Students must solve their homeworks");
    }

    void doPractice()
    {
        System.out.println("Students must practise to get good marks");
    }
}

class SyntaxStudent extends Student{

    void doHomeWork()
    {
        System.out.println("Syntax students must solve all Repls three time");
    }

    void doPractice()
    {
        System.out.println("Syntax students must do their own research and practice");
    }

}

class CollegeStudent extends Student{

    void doPractice()
    {
        System.out.println("College students must practice to get good marks");
    }
}

class SchoolStudent extends Student{

}

