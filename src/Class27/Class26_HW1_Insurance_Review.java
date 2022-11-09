package Class27;

import java.util.ArrayList;

public class Class26_HW1_Insurance_Review {

    /* Create a class Insurance that will have an attribute as insuranceName
       and unimplemented behaviour as getQuote and cancelInsurance.
       Create 3 subclasses Car, Pet, Health.
       Car class has its own attribute as carModel and Class Pet has petType attribute.
       Create 3 objects of the subclasses and store them in an ArrayList.
       Using for loop / advanced for loop / iterator, access all methods of the class.
     */

    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Adam", "Tesla Model S"));
        insurances.add(new Pet("Geico", "Dog"));
        insurances.add(new Health("State Life"));

        System.out.println(insurances);

        for(Insurance i : insurances)
        {
            i.getQuote();
            i.cancelInsurance();
        }
    }
}

abstract class Insurance{
    String insuranceName;

    Insurance(String insuranceName){
        this.insuranceName = insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Car extends Insurance{

    String carModel;

    Car(String insuranceName, String carModel){
        super(insuranceName);  // Calls the parent class constructor
        this.carModel = carModel;
    }

    void getQuote()
    {
        System.out.println(insuranceName + " charges 3% of the car value for " + carModel);
    }

    void cancelInsurance()
    {
        System.out.println(insuranceName + " has been cancelled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Pet extends Insurance{

    String petType;

    Pet(String insurance, String petType){
        super(insurance);
        this.petType = petType;
    }

    void getQuote()
    {
        System.out.println(insuranceName + " charges 1500 USD for " + petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + " has been cancelled for " + petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Health extends Insurance{

    Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " charges 2000 USD for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + " has been cancelled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
