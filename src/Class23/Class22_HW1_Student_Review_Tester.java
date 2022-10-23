package Class23;

public class Class22_HW1_Student_Review_Tester {

    public static void main(String[] args) {
        Student[] arr = {new CollegeStudent(), new SchoolStudent(), new SyntaxStudent()};

        for(Student st : arr)
        {
            st.study();
            st.doHomeWork();;
            st.doPractice();
        }

    }
}
