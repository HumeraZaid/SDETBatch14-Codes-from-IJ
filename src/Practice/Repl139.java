package Practice;

public class Repl139 {

    public String alphabetical(String str)
    {
        String str1 = "";
        for (int i = 0; i < str.length() - 1; i++)
        {
            if(i==0)
            {
                str1+=str.charAt(i);
            }
            if(str.charAt(i+1)>str.charAt(i))
            {
                str1+=str.charAt(i+1);
            }
        }
        return str1;
    }


    public static void main(String[] args)
    {
        Repl139 obj = new Repl139();
        System.out.println(obj.alphabetical("hello"));
        System.out.println(obj.alphabetical("software"));
        System.out.println(obj.alphabetical("language"));
    }

}
