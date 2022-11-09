package ReviewClass11;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String rollNumber;

    public Student(String firstName, String lastName, String rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }

    void printName()
    {
        System.out.println(firstName + lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }

    /*
       If we don't override this method, Java, by default, checks only the address to figure out if two objects are same or not
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, rollNumber);
    }
}
