package Class16;

public class Student {

    /*
      Create a class called Student.
      Create three variables - Name , ID,  and  numberOfStudents.
      Create three objects of the Student class.
      Set the value for  studentName , studentID, and increment the numberOfStudents for each object.
      Print out  total number of students.
     */

    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {
        Student roman = new Student();
        roman.id = "1";
        roman.name = "Ivan";
        Student.numberOfStudent++;

        Student sonamKapoor = new Student();
        sonamKapoor.id = "2";
        sonamKapoor.name = "Sonam";
        Student.numberOfStudent++;

        System.out.println(Student.numberOfStudent);
        System.out.println(Student.numberOfStudent);
    }
}
