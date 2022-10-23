package Class15;

public class Class14_HW3_Palindrome_Review {

    /*
      Create a method that will print whether given String is palindrome or not.
     */

    void printPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

        if (stringBuilder.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }

    }

    public static void main(String[] args) {
        Class14_HW3_Palindrome_Review HW3 = new Class14_HW3_Palindrome_Review();
        HW3.printPalindrome("Dad");
        HW3.printPalindrome("Thor");
    }
}
