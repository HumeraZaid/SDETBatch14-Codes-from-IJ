package Class17;

public class HW1_Constructors {

    /*
       Write a java class that will have a constructor:
       one with parameters and second without any parameters.
       Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

     private String firstName;
     private String middleName;
     private String lastName;

     public HW1_Constructors ()
     {

     }

     public HW1_Constructors(String myFirstName, String myMiddleName, String myLastName)
     {
         firstName = myFirstName;
         middleName = myMiddleName;
         lastName = myLastName;
     }

     void printMyInfo()
     {
          String fullName = firstName + " " + middleName + " " + lastName;
          System.out.println("My full name is " + fullName);
     }
}
