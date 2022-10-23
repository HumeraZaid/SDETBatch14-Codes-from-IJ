package Practice;

public class Repl142 {

    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public Repl142(){

    }

    public Repl142(String s, int b, int y, String l){
        schoolName = s;
        batch = b;
        year = y;
        lastDayOfClass = l;
    }

    public void displayValues()
    {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}

class Repl142_Test{
    public static void main(String[] args) {
        Repl142 obj1 = new Repl142();
        obj1.displayValues();

        Repl142 obj2 = new Repl142("Syntax", 6, 2020, "07/30/2020");
        obj2.displayValues();


    }
}
