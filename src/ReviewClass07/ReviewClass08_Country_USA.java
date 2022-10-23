package ReviewClass07;

import ReviewClass08.Country;

public class ReviewClass08_Country_USA {
}

class USA extends Country{

    USA(String name){
        super(name);
    }

    public static void main(String[] args) {
        USA usa = new USA("USA");
        usa.name = "USA"; // public
        usa.capital = "DC";  // protected
    }

}
