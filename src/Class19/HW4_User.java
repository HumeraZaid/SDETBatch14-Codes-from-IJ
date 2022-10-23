package Class19;

public class HW4_User{

    /* Write program: userClass that has a constructor that initializes instance variable
       name and mobile number. Create a subclass userInfo that will have user address variable
       and it also being initialized through constructor call.
       Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name;
    String mobileNumber;

    public HW4_User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class HW4_UserInfo extends HW4_User {
    String address;

    public HW4_UserInfo(String name, String address, String mobileNumber) {
        super(name, mobileNumber);
        this.address = address;
    }

    public void userMethod() {
        System.out.println("Name of the user is " + name + ", address is " +
                address + ", and contact number is " + mobileNumber + ".");
    }

}

class HW4_Test{
    public static void main(String[] args) {
        HW4_UserInfo obj = new HW4_UserInfo("Humera Zaid Shelia", "6312 N Maplewood Ave., Chicago, IL - 60659", "123-456-7890");
        obj.userMethod();
    }
}

