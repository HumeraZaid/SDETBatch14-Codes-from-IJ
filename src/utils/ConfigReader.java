package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read(String path) {

        var properties = new Properties(); // That special software which helps us to read data from that file
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);  // It helps us to navigate to the file
            properties.load(fileInputStream); // Loads all the data from the file inside (memory)
        }
        catch ( FileNotFoundException e){
            // System.out.println("Please check your file path"); // For normal humans with no technical background
            e.printStackTrace(); // When programmers will use this code
        }
        catch (IOException e){
            // System.out.println("Please check your hard drive");
        }
        finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
