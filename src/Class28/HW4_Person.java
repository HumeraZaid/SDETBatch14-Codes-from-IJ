package Class28;

import java.util.TreeMap;

public class HW4_Person {

    /* Create a Person class with following private fields: name, lastName, age, salary.
       Variables should be initialized through constructor.
       Inside the class, also create a method to print user details.
       In Test Class, create a Map that will store key in ascending order.
       In that map, store personId and a Person Object. Print each object details.
     */

}

class Person{

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails()
    {
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age + " " +
                           ", Salary: " + salary + ".");
    }
}

class Test{
    public static void main(String[] args) {

        TreeMap<Integer, Person> person = new TreeMap<>();
        person.put(0001, new Person("Sadaf", "Shaikh", 35, 250000));
        person.put(0002, new Person("Shoeb", "Shaikh", 34, 220000));
        person.put(0003, new Person("Humera", "Shaikh", 31, 1900000));
        person.put(0004, new Person("Saniya", "Shaikh", 30, 1700000));

        for(Integer key : person.keySet())
        {
            person.get(key).printDetails();
        }
    }
}


