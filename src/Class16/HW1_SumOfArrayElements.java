package Class16;

public class HW1_SumOfArrayElements {

    /*
       Create a method that will accept an array as parameters and
       will return a sum of all elements from that array.
       Method should be visibly only within same package and
       accessible by creating an instance of the class.
     */

    int arrayElementsSum(int arr[])
    {
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HW1_SumOfArrayElements sum1 = new HW1_SumOfArrayElements();
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Sum of all elements of this array is " + sum1.arrayElementsSum(arr) + ".");
    }
}
