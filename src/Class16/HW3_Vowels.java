package Class16;

public class HW3_Vowels {

    /*
       Create a method that will accept a String as a parameter and
       return a new String that consist only of vowels.
       Method should be available inside the class only where it was declared and
       executed by calling its name.
     */

    private String printVowels(String str)
    {
        String printVowels = str.toLowerCase().replaceAll("[^aeiuo]", "");
        return printVowels;
    }

    public static void main(String[] args) {
        HW3_Vowels vw = new HW3_Vowels();
        System.out.println(vw.printVowels("Adieu"));
    }
}
