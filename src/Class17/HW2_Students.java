package Class17;

public class HW2_Students {

    /*
       Write a java Class Students that have a constructor which takes students name and 3 subject grades.
       Inside your class also have a method to Calculate Average Grade.
       Test Student class for 5 different students with different marks.
       Your program should print an average mark of each students name.
     */

    private String name;

    private double mathScore;
    private double scienceScore;
    private double languageArtsScore;

    public HW2_Students(String studentName, double studentMathScore, double studentScienceScore, double studentLanguageArtsScore)
    {
        name = studentName;
        mathScore = studentMathScore;
        scienceScore = studentScienceScore;
        languageArtsScore = studentLanguageArtsScore;
    }

    void averageScore()
    {
        double average = (mathScore + scienceScore + languageArtsScore) / 3;
        System.out.println(name + " has scored " + (int)average + " marks.");
    }

    public static void main(String[] args) {

        HW2_Students student1 = new HW2_Students("John", 40, 55, 60);
        student1.averageScore();

        HW2_Students student2 = new HW2_Students("Rose", 70.0, 80, 65);
        student2.averageScore();

        HW2_Students student3 = new HW2_Students("Jane", 35, 89.5, 62);
        student3.averageScore();

        HW2_Students student4 = new HW2_Students("Emma", 43, 58, 76.0);
        student4.averageScore();

        HW2_Students student5 = new HW2_Students("Jack", 48.5, 83.0, 92.5);
        student5.averageScore();

    }

}
