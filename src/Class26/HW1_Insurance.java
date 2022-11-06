package Class26;

import java.util.ArrayList;

public class HW1_Insurance {

    /* Create a class Insurance that will have an attribute as insuranceName
       and unimplemented behaviour as getQuote and cancelInsurance.
       Create 3 subclasses Car, Pet, Health.
       Car class has its own attribute as carModel and Class Pet has petType attribute.
       Create 3 objects of the subclasses and store them in an ArrayList.
       Using for loop / advanced for loop / iterator, access all methods of the class.
     */

    public static void main(String[] args) {

        Insurance car = new Car("Progressive®", "BMW");
        Insurance pet = new Pet("HealthyPaws", "Cat");
        Insurance health = new Health("UnitedHealthcare®");

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);

       for(int i=0; i<insurances.size(); i++)
       {
           insurances.get(i).getQuote();
           insurances.get(i).cancelInsurance();
           System.out.println();
       }

    }
}

abstract class Insurance{

    String insuranceName;

    public Insurance(String insuranceName)
    {
        this.insuranceName = insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}

class Car extends Insurance{

    String carModel;

    public Car(String insuranceName, String carModel)
    {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote()
    {
        System.out.println(insuranceName + " will provide you with collision coverage, comprehensive coverage," +
                          " injury liability, property damage liability, and towing/rental car coverage" +
                          " in just $1500 yearly for your " + carModel + ".");
    }

    void cancelInsurance()
    {
        System.out.println("We want to cancel this plan provided by " + insuranceName + " for our " + carModel +
                          " as we are not satisfied with its services.");

    }
}

class Pet extends Insurance{

    String petType;

    public Pet(String insuranceName, String petType)
    {
        super(insuranceName);
        this.petType = petType;
    }

    void getQuote()
    {
        System.out.println(insuranceName + " will give you $7 off monthly if you choose the Premium plan for your " +
                           petType + ".");
    }

    void cancelInsurance()
    {
        System.out.println(" We want to cancel the Premium plan provided by " + insuranceName +
                          " since we are not getting the Premium services for our " + petType + ".");
    }

}

class Health extends Insurance{

    Health(String insuranceName){
        super(insuranceName);
    }

    void getQuote()
    {
        System.out.println( insuranceName + " quotes you with the lowest rate for its Elite plan.");
    }

    void cancelInsurance()
    {
        System.out.println("The Elite plan of " + insuranceName + " doesn't cover the services we need." +
                           " Please cancel our insurance starting from the next billing cycle.");
    }

}
