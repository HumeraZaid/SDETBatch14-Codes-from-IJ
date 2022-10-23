package Class14;

import java.util.Scanner;

public class HW4_HelloInDifferentLanguages {

    /*
      Create a method that will say Hello in a different language based on the country that will be
      passed when method is executed.
     */

    String sayHello(String country)
    {
        String sayHello = null;
        switch (country)
        {
            case "USA":
                sayHello = "HI!";
                break;
            case "India":
                sayHello = "नमस्ते!";
                break;
            case "Spain":
                sayHello = "Holla!";
                break;
            case "KSA":
                sayHello = "!ٱلسَّلَامُ عَلَيْكُمْ";
                break;
            default:
                sayHello = "Unknown";
                break;
        }
        return sayHello;

    }

    public static void main(String[] args) {
            String country = "KSA";
            HW4_HelloInDifferentLanguages str = new HW4_HelloInDifferentLanguages();
            System.out.println("Hello in " + country + " is greeted as: " + str.sayHello(country));

        }
}
