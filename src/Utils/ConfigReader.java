package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read(String path) throws IOException {
        var fileInputStream = new FileInputStream(path); // It helps us to navigate to the file
        var properties = new Properties();  // That special software which helps us to read data from that file
        properties.load(fileInputStream); // Loads all the data from the file inside (memory)
        return properties;
    }
}
