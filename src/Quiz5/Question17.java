package Quiz5;

public class Question17 {
}

class Point {
    int m_x, m_y;

    public Point(int x) {

        System.out.println("I am constructor");

    }


    public Point(int x, int y) {

        m_x = x;

        m_y = y;

    }
    public static void main(String args[])  {
        Point p = new Point();
    }
}

