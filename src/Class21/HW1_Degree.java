package Class21;

public class HW1_Degree {

    /* Create a class 'Degree' having a method 'getPrerequisite' that prints
       "To get a degree you need high school diploma".
       Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
       In Masters class override method 'getPrerequisite'.
       Call the method by creating an object of each of the three classes.
     */

    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getPrerequisites();

        Bachelors bachelors =  new Bachelors();
        bachelors.getPrerequisites();

        Masters masters = new Masters();
        masters.getPrerequisites();
    }
}

class Degree{
    void getPrerequisites()
    {
        System.out.println("To get a degree, you need high school diploma.");
    }
}

class Bachelors extends Degree{

}

class Masters extends Degree{

    void getPrerequisites()
    {
        System.out.println("To get a Masters degree, you need a Bachelors degree.");
    }
}
