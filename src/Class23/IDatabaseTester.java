package Class23;

public class IDatabaseTester {
    public static void main(String[] args) {
        IDatabase iDatabase = new IBM();
        iDatabase.openDatabase();
        iDatabase.readData();
        iDatabase.writeData();
    }
}
