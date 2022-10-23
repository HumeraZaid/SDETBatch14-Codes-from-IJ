package Class15;

public class Class14_HW5_Email_Review {

    /*
      Create a method createEmail().
      Based on values of users name, lastName and email type,
      your method should return complete email Address. Example:
      createEmail(John, Snow, gmail) → johnsnow@gmail.com.
     */

    String createEmail(String firstName, String lastName, String emailType)
    {
        return(firstName + lastName + "@" + emailType + ".com").toLowerCase();
    }

    public static void main(String[] args) {
        Class14_HW5_Email_Review HW5 = new Class14_HW5_Email_Review();
        String fullEmail = HW5.createEmail("John", "Snow", "gmail");
        System.out.println(fullEmail);
        System.out.println(HW5.createEmail("Niazi", "Zamir", "outlook"));
    }
}
