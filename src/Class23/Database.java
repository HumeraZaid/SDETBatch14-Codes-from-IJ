package Class23;

public abstract class Database {

    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}

    /*
       Hover over the error and click on the implement methods option
     */

class MicrosoftDatabase extends Database{

    void openDatabase()
    {
        System.out.println("Opening the Microsoft Database");
    }

    void readData()
    {
        System.out.println("Reading the data from MSDatabase");
    }

    void writeData()
    {
        System.out.println("Writing the data to MSDatabase");
    }

    void closeDatabase()
    {
        System.out.println("Closing the MSDatabase");
    }
}

class Oracle extends Database{

    void openDatabase()
    {
        System.out.println("Opening the Oracle database");
    }

    void readData()
    {
        System.out.println("Reading the data from Oracle databse");
    }

    void writeData()
    {
        System.out.println("Writing the data to Oracle database");
    }

    void closeDatabase()
    {

        System.out.println("Closing the Oracle database");
    }
}

