package Practice;

public class Repl132 {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);

    }
    //create method reduce10 here

    static int[][] reduce10(int[][] array) {

        int[][] arr = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                arr[i][j] = array[i][j] - 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

}
