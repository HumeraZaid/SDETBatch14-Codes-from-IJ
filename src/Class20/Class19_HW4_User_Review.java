package Class20;

public class Class19_HW4_User_Review {

    /* Write program: userClass that has a constructor that initializes instance variable
       name and mobile number. Create a subclass userInfo that will have user address variable
       and it also being initialized through constructor call.
       Print users name, mobile number and address in userDetails method. Test your code.
     */

    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo("Humera","123-456-7890" , "Pizza Hut King Street");
        userInfo.printUserDetails();

    }
}

class UserClass{
    String name;
    String mobileNumber;

    UserClass(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class UserInfo extends UserClass{
    String address;

    UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address = address;
    }

    void printUserDetails()
    {
        System.out.println("Name " +  name + " Mobile number " + mobileNumber + " Address " +
                           address);
    }
}
