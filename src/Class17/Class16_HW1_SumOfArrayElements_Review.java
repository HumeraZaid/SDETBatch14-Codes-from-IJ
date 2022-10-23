package Class17;

public class Class16_HW1_SumOfArrayElements_Review {

    /*
       Create a method that will accept an array as parameters and
       will return a sum of all elements from that array.
       Method should be visibly only within same package and
       accessible by creating an instance of the class.
     */

    double sumArray(int[] arr)
    {
        int sum = 0;
        for(int num : arr)
        {
            sum+=num;
        }
        return sum;
    }
}
