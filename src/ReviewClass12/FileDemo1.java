package ReviewClass12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {

    /* We want to have a method that can help us read data from the properties file.
       This method should be available to any class in the project and once we pass the key,
       it should give us its value.
     */

    public static void main(String[] args) throws IOException {

        System.out.println(getProperty("password"));

    }

    public static String getProperty(String key) throws IOException {
        String path = "Data/config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}
