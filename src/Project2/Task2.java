package Project2;

public class Task2 {

    /* We have to calculate the average of marks obtained in three subjects by student A and by student B.
       Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage
       of marks. Provide implementation of abstract method in classes 'A' and 'B'.
       The constructor of student A takes the marks in three subjects as its parameters and the marks in
       four subjects as its parameters for student B. Test your code
     */

    public static void main(String[] args) {
        A a = new A(60, 70, 80);
        a.getPercentage();

        B b = new B(65, 75, 85, 95);
        b.getPercentage();
    }
}

abstract class Marks{

    public abstract double getPercentage();
}

class A extends Marks{
    int sub1, sub2, sub3;

    A(int sub1, int sub2, int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public double getPercentage()
    {
        double percentage = ((sub1 + sub2 + sub3)/(double)300) * 100;
        System.out.println("Percentage of Student A is " + percentage + "%");
        return percentage;
    }
}

class B extends Marks{

    int sub1, sub2, sub3, sub4;

    public B(int sub1, int sub2, int sub3, int sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public double getPercentage()
    {
        double percentage = ((sub1 + sub2 + sub3 + sub4)/(double)400) * 100;
        System.out.println("Percentage of Student B is " + percentage + "%");
        return percentage;
    }
}
