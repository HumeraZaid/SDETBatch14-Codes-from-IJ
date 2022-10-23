package Project2;

public class Task3 {

    /* Create a Class Car that would have the following fields: carPrice and color and method
       calculateSalePrice(), which should be returning a price of the car. Create 2 subclasses: Sedan and Truck.
       The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
       in which returned price is calculated as following: if weight>2000 then returned price
       car should include 10% discount, otherwise 20% discount.
       The Sedan class has field as length and also does its own implementation of calculateSalePrice():
       if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */

    public static void main(String[] args) {
        Truck truck = new Truck(40000, "Black", 3000);
        truck.calculateSalePrice();

        Sedan sedan = new Sedan(25000, "White", 10);
        sedan.calculateSalePrice();
    }
}

class Car{
    double carPrice;
    String color;

    public Car(double carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }
    public double calculateSalePrice()
    {
        return carPrice;
    }
}

class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight){
        super(carPrice,color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice()
    {
        if(weight>2000)
        {
            carPrice = carPrice - ((10/(double)100) * carPrice);
            System.out.println("You have received a 10% discount and the price of this truck after discount is $" + carPrice + ".");
        }
        else
        {
            carPrice = carPrice - ((20/(double)100) * carPrice);
            System.out.println("You have received a 20% discount and the price of this truck after discount is $" + carPrice + ".");
        }
        return super.calculateSalePrice();
    }
}

class Sedan extends Car{
    int length;

    public Sedan(double carPrice, String color, int length){
        super(carPrice,color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice()
    {
        if(length>20)
        {
            carPrice = carPrice - ((5/(double)100) * carPrice);
            System.out.println("You have received a 5% discount and the price of this car after discount is $" + carPrice);
        }
        else
        {
            carPrice = carPrice - ((10/(double)100) * carPrice);
            System.out.println("You have received a 10% discount and the price of this car after discount is $" + carPrice);
        }
        return super.calculateSalePrice();
    }

}


