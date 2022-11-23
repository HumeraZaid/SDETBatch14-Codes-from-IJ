package Class30;

import utils.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {

    public static void main(String[] args) {

        method2();
    }

    public static void method1() {

        try {
            System.out.println(ExcelReader.read("Data/Test.xlsx"));
        }
        catch (IOException e) {
            System.out.println("Send an email to Tymur your is unable to locate the files" +
                               "we don't care if it s weekend come to office and fix it.");
        }
    }

    public static void method2() {
        method1();
    }

}
