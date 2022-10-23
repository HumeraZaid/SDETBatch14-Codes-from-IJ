package Practice;

public class Repl151 extends Method {

    public static void main(String[] args) {
        int[][] a = {

                       { 1, 2, 3 },

                       { 4, 5, 6 },

                       { 7, 8, 9 }

                    };
        Method m = new Method();
        System.out.println(sum2D(a));

    }
}

class Method{

    static int sum2D(int[][] arr){
        int sum=0;
        for(int[]row : arr)
        {
            for(int values : row)
            {
                sum+=values;
            }
        }
        return sum;
    }
}
