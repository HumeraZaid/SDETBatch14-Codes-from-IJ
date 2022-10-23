package Class18;

public class Animal{

    protected String name;
    String breed;
    int age;
    double weight;

    void printInfo()
    {
        String name = "now this will be printed";
        System.out.println("Name " + this.name + " Breed " + this.breed + " Age " + this.age +
                           " Weight " + this.weight);
    }

}
