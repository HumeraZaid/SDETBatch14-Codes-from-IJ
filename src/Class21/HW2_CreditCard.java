package Class21;

public class HW2_CreditCard {

    /* Create a class CreditCard and define variable balance and interest.
       Create an instance method that will calculate interest based on the given balance.
       Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
       Call the method by creating an object of each of the three classes.
     */

    public static void main(String[] args) {
        CreditCard cCard = new CreditCard();
        cCard.calculateInterest(5000);

        Visa visa = new Visa();
        visa.calculateInterest(3001.99);

        AX ax = new AX();
        ax.calculateInterest(10000);
    }
}

class CreditCard{

    double balance;
    double interest;

    void calculateInterest(double balance){
        if(balance<=5000 && balance>=3000)
        {
            System.out.println("You have been charged $" + (2.5/100)*balance + " as interest.");
        }
        else {
            System.out.println("No interest charged.");
        }
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{

    void calculateInterest(double balance){
        if(balance<=3000)
        {
            System.out.println("You have been charged $" + (3.5/100)*balance + " as interest.");
        }
        else {
            System.out.println("You have enough balance in your account, so no interest charged.");
        }
        }
}
