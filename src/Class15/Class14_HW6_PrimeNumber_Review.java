package Class15;

public class Class14_HW6_PrimeNumber_Review {

    /*
      Write a method to return whether given number is prime or not?
     */

    boolean isPrime(int num)
    {
        boolean isPrime =  true;
        if(num>1)
        {
            for (int i = 0; i<num; i ++)
            {
                if(num%2==0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        else
        {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Class14_HW6_PrimeNumber_Review HW6 = new Class14_HW6_PrimeNumber_Review();
        System.out.println(HW6.isPrime(12));
        System.out.println(HW6.isPrime(5));
    }
}
