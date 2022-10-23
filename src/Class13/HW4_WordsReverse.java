package Class13;

public class HW4_WordsReverse {
    public static void main(String[] args) {

        /* How would you reverse a String word by word? For example:
         * input=>This is sentence i want to reverse
         * output=>sihT si ecnetnes i tnaw ot esrever
         */

        System.out.println("First way to do it:");

        String str1 = "Love the life you live";
        String[] a = str1.split(" ");

        System.out.println(str1);

        for (int i = 0; i<a.length ; i++)
        {
            for(int j = a[i].length()-1; j>=0; j--)
            {
                System.out.print(a[i].charAt(j));
            }
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Second way to do it:");


        String str2 = "Zaid Humera Zahra";
        String[] b = str2.split(" ");

        System.out.println(str2);

        for(int k = 0; k<b.length; k++)
        {
            StringBuilder l = new StringBuilder(b[k]);
            System.out.print(l.reverse() + " ");
        }
    }
}
