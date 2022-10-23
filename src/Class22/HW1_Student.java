package Class22;

public class HW1_Student {

    /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
       Define common behavior within parent class and override some of the methods in child classes.
       Define some methods specific to child classes.
       Write example of achieving run time polymorphism.
     */

    public static void main(String[] args) {
        Student[] student = { new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student stud : student)
        {
            stud.readAndWrite();
            stud.homeWork();
        }

        SyntaxStudent syntaxStudent = new SyntaxStudent();
        syntaxStudent.interviewPrep();

        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.collegeExams();

        SchoolStudent schoolStudent = new SchoolStudent();
        schoolStudent.schoolTest();

    }

}

class Student{

    public void readAndWrite()
    {
        System.out.println("I am a student and I can read and write.");
    }

    public void homeWork()
    {
        System.out.println("I also need to submit my HW on time.");
    }
}

class SyntaxStudent extends Student{

    public void readAndWrite()
    {
        System.out.println("I am a student at Syntax and I am learning to write and debug codes in Java.");
    }

    public void homeWork()
    {
        System.out.println("I have to submit my daily tasks, Repls, and Quiz on time, else I am marked late.");
        System.out.println();
    }

    public void interviewPrep()
    {
        System.out.println("Syntax student : Once I am confident enough with my coding and frameworks skills, Syntax will prepare me for interviews.");
        System.out.println();
    }
}

class CollegeStudent extends Student{

    public void readAndWrite()
    {
        System.out.println("I am a College Student and I am doing a major in Political Science.");
    }

    public void homeWork()
    {
        System.out.println("I am expected to submit my assignments on time, but I just party around and chill.");
        System.out.println();
    }

    public void collegeExams()
    {
        System.out.println("College student: I will be able to apply in a reputed University for my Masters only if I do well in my College exams.");
        System.out.println();
    }
}

class SchoolStudent extends Student {

    public void readAndWrite() {
        System.out.println("I am a KinderGarten student and I am learning to read and write Alphabets and Numbers.");
    }

    public void homeWork() {
        System.out.println("I have to submit my HW on time, else I will get a punishment from the teacher.");
        System.out.println();
    }

    public void schoolTest() {
        System.out.println("School student: I need to study hard for a bright future.");
        System.out.println();
    }
}




