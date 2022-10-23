package Class17;

public class Class16_HW1_SumOfArrayElementsTester {

    public static void main(String[] args) {

        Class16_HW1_SumOfArrayElements_Review obj =  new Class16_HW1_SumOfArrayElements_Review();
        int[] arr = {10,10,20,30};
        System.out.println((int)obj.sumArray(arr));  // Casting double into integer with (int)
        double sum= obj.sumArray(arr);
        System.out.println(sum);

    }
}
