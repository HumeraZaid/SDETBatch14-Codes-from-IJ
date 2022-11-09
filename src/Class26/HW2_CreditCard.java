package Class26;

import java.util.LinkedList;

public class HW2_CreditCard {

    /* Create a Card class that will have implemented and unimplemented methods
       and a constructor that will initialize credit card type.
       Create 3 subclasses of the Card class.
       Create 3 objects of different card and store them into LinkedList.
       Using for loop / advanced for loop / iterator access all methods of the class.
     */

    public static void main(String[] args) {

        Card card1 = new Amex("American Express", 500);
        Card card2 = new Visa("Chase Freedom", 700.45);
        Card card3 = new MasterCard("Bank of America", 899.3);

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for(int i=0; i<cards.size(); i++)
        {
            cards.get(i).currentBalance();
            cards.get(i).paymentDue();
            System.out.println();
        }

    }
}

abstract class Card{

    String cardName;
    double balance;

    void currentBalance()
    {
        System.out.println("The current balance on your " + cardName + " card is $" + balance + ".");
    }

    abstract void paymentDue();

    Card(String cardName, double balance)
    {
        this.cardName = cardName;
        this.balance = balance;
    }

}

class Amex extends Card{

    Amex(String cardName, double balance)
    {
        super(cardName, balance);
    }

    public void paymentDue()
    {
        System.out.println("Payment of $" + balance + " on your " + cardName + " card is due on 11/20/2022" + ".");
    }
}

class Visa extends Card{

    Visa(String cardName, double balance)
    {
        super(cardName, balance);
    }

    public void paymentDue()
    {
        System.out.println("Payment of $" + balance + " on your " + cardName + " card is due on 11/25/2022" + ".");
    }
}

class MasterCard extends Card{

    MasterCard(String cardName, double balance)
    {
        super(cardName, balance);
    }

    public void paymentDue()
    {
        System.out.println("Payment of $" + balance + " on your " + cardName + " card is due on 11/28/2022" + ".");
    }
}
