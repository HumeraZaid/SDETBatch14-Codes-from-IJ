package Class23;

public class DatabaseTester {
    public static void main(String[] args) {
        Database database = new Oracle();
        database.openDatabase();
        database.readData();
        database.writeData();
        database.closeDatabase();

    }
}
