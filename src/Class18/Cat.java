package Class18;

public class Cat extends Animal{

    double height;

    public Cat(String catName, String catBreed)
    {
        name = catName;
        breed = catBreed;
    }

    public Cat(String catName, String catBreed, int catAge, double catWeight)
    {
        name = catName;
        breed = catBreed;
        age = catAge;
        weight = catWeight;
    }

    public void printInfo()
    {
        System.out.println("Name " + this.name + " Breed " + this.breed + " Age " + this.age +
                           " Weight " + this.weight);
    }
}
