package Class14;

import java.util.Scanner;

public class HW5_Email {

    /*
      Create a method createEmail().
      Based on values of users name, lastName and email type,
      your method should return complete email Address. Example:
      createEmail(John, Snow, gmail) → johnsnow@gmail.com.
     */

    String createEmail(String firstName, String lastName, String emailType)
    {
        String createEmail = firstName + lastName + "@" + emailType + ".com";
        return createEmail;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        String firstName = inp.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = inp.nextLine();
        System.out.println("Please enter the e-mail server to create your e-mail.");
        String emailType = inp.nextLine();

        HW5_Email em = new HW5_Email();
        System.out.println("The suggested e-mail ID for you is: " +
                         em.createEmail(firstName, lastName, emailType));
    }


}
