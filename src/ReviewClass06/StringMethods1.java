package ReviewClass06;

public class StringMethods1 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            String textFromApplication = "  Enroll today  ";
            String textFromUserStory = "Enroll today";

            if(textFromApplication.trim().equals(textFromUserStory))
            {
                System.out.println("Text is matched. Test Passed.");
            }
            else
            {
                System.out.println("Text is NOT matched. Test Failed");
            }

            // trim() -> Returns a string whose value is this string, with any leading and trailing whitespace removed

            System.out.println(textFromApplication.trim());  // "Enroll today"
            System.out.println(textFromApplication);  // "  Enroll today  "

            // substring
            String str = "Hello Class";
            String part2 = str.substring(6);  // Class
            System.out.println(part2);

            String part1 = str.substring(0,5);
            System.out.println(part1);  // Hello

            // concat
            String newString = part1.concat(" ").concat(part2);
            System.out.println(newString); // Hello Class

            System.out.println((part1 + part2)); // HelloClass

            // Some examples
            char single = newString.substring(6).charAt(0);
            System.out.println(single); // C

            // newString.charAt(0).substring(6); // Compilation Error

            // replace() -> Replaces each substring of this string that matches target sequence with the specified replacement sequence
            String myString = "Today is September";
            myString = myString.replace("September","October"); // replaces if found

            System.out.println(myString);   // Today is October

            myString =myString.replace('A', 'w');   // Does not replace if not found
            System.out.println(myString);  // Today is October

            System.out.println("   SPLIT    ");

            String myStr = "Today is review class";
            String[] array = myStr.split(" ");
            System.out.println(array.length); // 5
            System.out.println(array[3]);  // review

            for (int i=0; i<array.length; i++)
            {
                System.out.print(array[i] + " ");  // Today is review class
            }
            System.out.println();

            // Other way

            for(String arr : array)
            {
                System.out.print(arr + " ");  // Today is review class
            }

        }

    }
