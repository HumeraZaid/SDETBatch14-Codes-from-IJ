package Class23;

public interface IDatabase {

    void openDatabase();
    void readData();
    void writeData();
}

class IBM implements IDatabase{

    public void openDatabase()
    {
        System.out.println("Opening the IBM database");
    }

    public void readData()
    {
        System.out.println("Reading the data from the IBM Database");
    }

    public void writeData()
    {
        System.out.println("Writing the data to the database");
    }
}
