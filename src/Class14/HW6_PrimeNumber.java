package Class14;

public class HW6_PrimeNumber {

    /*
      Write a method to return whether given number is prime or not?
     */

    void isPrime(int num)
    {
        boolean prime  = false;
        for (int i = 2; i <= num / 2; i++)
        {

            if (num % i == 0)
            {
                prime = true;
                break;
            }
        }

        if (!prime)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }

}
        public static void main(String[] args)
        {
          HW6_PrimeNumber pn = new HW6_PrimeNumber();
          pn.isPrime(13);
        }


}
