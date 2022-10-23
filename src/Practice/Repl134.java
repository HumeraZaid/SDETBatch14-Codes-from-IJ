package Practice;

public class Repl134 {
    static int countVowels(String s)
    {
        String sb = s.replaceAll("[^aeiou]", "");

        return sb.length();
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
