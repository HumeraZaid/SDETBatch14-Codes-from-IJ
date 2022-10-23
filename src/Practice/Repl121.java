package Practice;

public class Repl121 {
    int value1;
    double value2;
    char value3;

    public static void main(String[] args)
    {
        Repl121 obj1 = new Repl121();
        obj1.value1 = 10;
        obj1.value2 = 10.23;
        obj1.value3 = 'a';
        System.out.println(obj1.value1 + "\n" + obj1.value2 + "\n" + obj1.value3);

        Repl121 obj2 = new Repl121();
        obj2.value1 = 100;
        obj2.value2 = 100.23;
        obj2.value3 = 's';
        System.out.println(obj2.value1 + "\n" + obj2.value2 + "\n" + obj2.value3);
    }
}
