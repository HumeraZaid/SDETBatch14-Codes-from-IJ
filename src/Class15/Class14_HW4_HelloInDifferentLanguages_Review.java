package Class15;

public class Class14_HW4_HelloInDifferentLanguages_Review {

    /*
      Create a method that will say Hello in a different language based on the country that will be
      passed when method is executed.
     */

    void sayHello(String country) {
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("Assalamu 'alaykum");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Country not supported");
                break;
        }
    }

    public static void main(String[] args) {
        Class14_HW4_HelloInDifferentLanguages_Review HW4 = new Class14_HW4_HelloInDifferentLanguages_Review();
        HW4.sayHello("USA");
        HW4.sayHello("Turkiye");
    }
}
