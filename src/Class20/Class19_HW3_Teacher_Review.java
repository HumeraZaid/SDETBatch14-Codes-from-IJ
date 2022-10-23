package Class20;

public class Class19_HW3_Teacher_Review {

    /* Write a Java program called Teacher.
       Identify features and behaviour of that Class.
       Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
       that would have it their own features and behaviour. Test all 4 classes.
     */
}

class Teacher{
    protected String name;
    protected int age;
    protected int yearsOfExperience;

    public Teacher(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    void teach()
    {
        System.out.println(name + " is teaching.");
    }
}

class MathTeacher extends Teacher{
    void teachClass()
    {
        System.out.println("I will teach class even after the world is going to end after my class");
    }

    public MathTeacher(String name, int age, int noOfYears) {
        super(name, age, noOfYears);
    }
}

class ChemistryTeacher extends Teacher{
    boolean teachOrganic;

    ChemistryTeacher(String name, int age, int yearsOfExperience){
        super(name, age, yearsOfExperience);
    }
    void teachChem()
    {
        System.out.println(name + " teaching Chemistry");
    }
}

class PianoTeacher extends Teacher {
    String pianoType;

    PianoTeacher(String name, int age, int yearsOfExperience, String pianoType) {
        super(name, age, yearsOfExperience);
        this.pianoType = pianoType;
    }
}

class Test{
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher("Gulcan", 18, 5);
        mathTeacher.teach();

        PianoTeacher pianoTeacher =  new PianoTeacher("James", 25, 6, "Grand");
        pianoTeacher.teach();

    }
}
