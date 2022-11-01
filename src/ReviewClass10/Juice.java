package ReviewClass10;


final class Drink{

    void drink()
    {
        System.out.println("Drinking method");
    }

    // final methods cannot be overridden

    protected final void enjoy()
    {
        System.out.println("We enjoy drinking water");
    }
}

// Compiler Error: The type Juice cannot subclass the final class Drink
 /* public class Juice extends Drink {

    // Compiler Error: Cannot override the final method from Drink

    public void enjoy()
    {
        System.out.println("We enjoy drinking juice");
    }
}
 */


