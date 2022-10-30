package Class24;

public class CW1_Horse {

     /* Create a horse class.
        Have 5 fields of your choice.
        Create constructor and getter setter methods for this class.
        At least write one condition inside setter class.
     */

    String name;
    String breed;
    String color;
    int age;
    double weight;

    public CW1_Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            System.out.println("Name cannot be empty. Please try again.");
        }
        else {
            this.name = name;
        }
    }

    public String getBreed(String name) {
        if(name.equals("Josh"))
        {
            return "Not allowed";
        }
        else {
            return breed;
        }
    }


    public void setBreed(String breed) {
        if(breed.isEmpty())
        {
            System.out.println("Breed cannot be empty. Please try again.");
        }
        else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty())
        {
            System.out.println("Color cannot be empty. Please try again.");
        }
        else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
        {
            System.out.println("Age cannot be negative.");
        }
        else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 1000)
        {
            System.out.println("This horse is too huge.");
        }
        else {
            this.weight = weight;
        }
    }

}

class CW1_Horse_Test{
    public static void main(String[] args) {
        CW1_Horse horse = new CW1_Horse("", "", "", -8, 2000);
    }
}
