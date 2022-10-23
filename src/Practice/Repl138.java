package Practice;

public class Repl138 {

    static String method1()
    {
        return "default";
    }

    protected static String method2()
    {
        return "protected";
    }

    public static String method3()
    {
        return "public";
    }
}

class Main {

    public static void main(String[] args)
    {
        System.out.println(Repl138.method1());
        System.out.println(Repl138.method2());
        System.out.println(Repl138.method3());
    }
}
