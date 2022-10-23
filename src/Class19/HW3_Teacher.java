package Class19;

public class HW3_Teacher {

    /* Write a Java program called Teacher.
       Identify features and behaviour of that Class.
       Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
       that would have it their own features and behaviour. Test all 4 classes.
     */

    String firstName;
    String lastName;
    String department;
    int empID;

    public HW3_Teacher(String firstName, String lastName, String department, int empID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.empID = empID;
    }

    public void teacherInfo()
    {
        System.out.println(firstName + " " + lastName + ", with employee ID - " + empID +
                           ", is the Head of the " + department + " department.");
    }
}

class HW3_MathTeacher extends HW3_Teacher{

    String sub1;
    String sub2;

    public HW3_MathTeacher(String firstName, String lastName, String department, int empID, String sub1, String sub2) {
        super(firstName, lastName, department, empID);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void mathTeacher()
        {
            System.out.println(firstName + " " + lastName + ", with employee ID - " + empID +
                    ", teaches " + sub1 + " and " + sub2 + ", in the " + department + " department.");
        }

}

class HW3_ChemistryTeacher extends HW3_Teacher{
    String sub1;
    String sub2;
    String sub3;

    public HW3_ChemistryTeacher(String firstName, String lastName, String department, int empID, String sub1, String sub2, String sub3) {
        super(firstName, lastName, department, empID);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public void chemistryTeacher()
    {
        System.out.println(firstName + " " + lastName + ", with employee ID - " + empID +
                    ", teaches " + sub1 + ", " + sub2 + ", and " + sub3 + ", in the " + department + " department.");
    }
}

class HW3_PianoTeacher extends HW3_Teacher{
    String sub1;

    public HW3_PianoTeacher(String firstName, String lastName, String department, int empID, String sub1) {
        super(firstName, lastName, department, empID);
        this.sub1 = sub1;
    }

    public void pianoTeacher()
    {
        System.out.println(firstName + " " + lastName + ", with employee ID - " + empID +
                ", is a " + sub1 + " teacher in the " + department + " department.");
    }
}

class HW3_Test{
    public static void main(String[] args) {
        new HW3_Teacher("Sadaf", "Shaikh", "Main", 1001).teacherInfo();
        new HW3_MathTeacher("Shoeb", "Shaikh", "Mathematics", 1002, "Math 1 - Algebra", "Math 2 - Geometry").mathTeacher();
        new HW3_ChemistryTeacher("Humera", "Shelia", "Science", 1003, "Biochemistry", "Organic Chemistry", "Inorganic Chemistry").chemistryTeacher();
        new HW3_PianoTeacher("Saniya", "Sayyed", "Music", 1004, "Piano").pianoTeacher();

    }

}
