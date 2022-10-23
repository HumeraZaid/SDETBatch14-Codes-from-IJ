package Practice;

public class Repl141 {

    public static int maxValue(int[] arr)
    {
        int a = 0;
        for (int i=0; i<arr.length;i++)
        {
            if(arr[i] > a)
            {
                a = arr[i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
