package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {

    public static void main(String[] args) throws IOException {

        /*
            Right-click on your file and click on "Copy Path/Reference...", then click on "Path From Content Root"
         */

        var path = "Data/config.properties"; // Location of the file
        var fileInputStream = new FileInputStream(path); // It helps us to navigate to the file
        var properties = new Properties();  // A special software that helps us to read data from the file
        properties.load(fileInputStream); // Loads all the data from the file inside (memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close(); // Closes the file
    }
}
