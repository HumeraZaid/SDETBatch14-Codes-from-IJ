package Class15;

public class Dog {

    String name; // instance
    static int noOfLegs;
    String color;

    void bark()
    {
        int i = 10; // local
        for (int j = 0; j < i; j++)
        {
            // j is also a local variable
            System.out.println("Barking");
        }
    }

        void printInfo()
        {
            System.out.println("name " + name);
        }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.name = "Lucky";

    }

}
