package Practice;

public class Repl133 {

    static int countA(String s)
    {
        char[] c = s.toCharArray();
        int count = 0;
        for(int i=0; i<c.length;i++)
        {
            if(c[i]=='a' || c[i] == 'A')
            {
                count+=1;
            }
        }
        return count;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
