package Class22;

public class FinalDemo {

    public static void main(String[] args) {
        Phone phone = new Phone();
        // phone.RAM = 50;

    }
}

final class Phone{
    final int RAM = 12;

    void takePic()
    {
        final int number = 10;
    }
}

/*
   class iPhone extends Phone{

    void takePics()
    {

    }
 */

