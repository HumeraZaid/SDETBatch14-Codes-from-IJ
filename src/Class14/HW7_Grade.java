package Class14;

import java.util.Scanner;

public class HW7_Grade {

    /*
      Create a class Student that will have a method getGrade.
      Your method should accept the score of a student and return a grade:
      score > 90 - A
      score >80 - B
      score >70 - C
      score > 50 - D
      anything else - F
     */

    char getGrade(double score)
    {
        char getGrade = 0;
        if(score>=90 && score<=100)
        {
            getGrade='A';
        }
        else if(score>=80 && score<=90)
        {
            getGrade='B';
        }
        else if(score>=70 && score<=80)
        {
            getGrade='C';
        }
        else if(score>50 && score<70)
        {
            getGrade='D';
        }
        else
        {
            getGrade= 'F';
        }
        return getGrade;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your score.");
        double score = inp.nextDouble();

        HW7_Grade gd = new HW7_Grade();
        System.out.println("Your grade is " + gd.getGrade(score) );

    }

}
