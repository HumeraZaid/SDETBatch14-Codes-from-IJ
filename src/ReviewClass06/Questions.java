package ReviewClass06;

public class Questions {

    public static void main(String[] args) {


    /*
     * how would you reverse a String without using reverse function?
     * 1. use charAt();
     * 2. use StringBuilder and reverse method
     * 3. use toCharArray(); --> HW
     */

		System.out.println("Using the charAt() method:");
		System.out.println();

    String str = "hello";
    String newString = "";

		for (int i = str.length()-1; i>=0; i--)
    {
        newString = newString + str.charAt(i);

    }

		System.out.println(newString);

		System.out.println();
		System.out.println("Using the StringBuilder class:");
		System.out.println();


    String s = "Class is almost over";
    StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		System.out.println(sb);


}

}
