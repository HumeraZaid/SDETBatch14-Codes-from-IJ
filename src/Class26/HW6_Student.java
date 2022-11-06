package Class26;

import java.util.HashSet;

public class HW6_Student {

    /* Create a Set collection that will hold object of Student type.
       In this set, we do not care about the insertion order.
       Each student object should have name and studentID.
       Display name of each student.
     */

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf Shelia", 111);
        Student student2 = new Student("Amira Saad Shelia", 222);
        Student student3 = new Student("Zahra Zaid Shelia", 333);
        Student student4 = new Student("Iqra Zubair Shelia", 444);

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);


        for(Student stud : hashSet)
        {
            stud.printName();
        }

    }
}

class Student{

        String name;
        int studentID;

        public Student(String name, int studentID){
         this.name = name;
         this.studentID = studentID;
        }

        public void printName()
        {
            System.out.println(name);
        }
}
