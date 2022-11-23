package ReviewClass13;

import utils.ConfigReader;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {

        ConfigReader.read("skjdbfjsdhbf");
        System.out.println("Important line of code");
    }
}
