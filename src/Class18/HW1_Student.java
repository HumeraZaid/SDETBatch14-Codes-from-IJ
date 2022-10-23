package Class18;

public class HW1_Student {

    /* Write a Student class that have instance variables name and address.
       Create a constructor that will initialize those variables.
       Print name & address of given student using displayInfo method.
     */

    private String name;
    private String address;

    public HW1_Student(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    void displayInfo()
    {
        System.out.println("Student's name is " + name + " and she resides at " + address + ".");
    }

    public static void main(String[] args) {
        new HW1_Student("Zahra Zaid Shelia", "6312 N Maplewood Ave., Chicago, IL - 60659").displayInfo();
    }
}
