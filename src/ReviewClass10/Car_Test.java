package ReviewClass10;

public class Car_Test {
    public static void main(String[] args) {

        Car car = new Tesla("Tesla", "X", "Yellow");
        car.drive();
        car.start();
        car.stop();
        //car.charge();   Cannot use because this method is not present in the parent class

        Tesla tesla = new Tesla("Tesla", "X", "Green");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
        // new Car();     Not possible because Car is an abstract class
    }
}
