package ReviewClass07;

public class Teacher {

    String name, lname;
    int experience;
    String subject;
    double salary;


    static String school;

    /*
       How to create a constructor?
       1. constructor name = class name
       2. no return type, not even void
     */

    // Using below constructor, we initialize instance variables (name, lname)

    Teacher(String name, String lname){
        this.name = name;
        this.lname = lname;
    }

    /*
       When you create a constructor, compiler is NOT going to create a default constructor for you.
     */

    void print()
    {
        System.out.println(name + " " + lname);
    }

}
