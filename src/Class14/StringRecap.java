package Class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String  str = "kjfksfAJDSKJD274362374!@##$";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("str = " + str);

        String sentence = "Batch 14 is great. Batch 14 is excellent? Batch 14 is amazing?";
        String[] split = sentence.split("[.?]");
        System.out.println("split = " + Arrays.toString(split));

        String str2 = "Batch 14 is great. Batch 14 is great.";
        String replace = str2.replaceFirst("great","good");
        System.out.println(replace);
    }

}
