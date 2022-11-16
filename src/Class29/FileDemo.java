package Class29;

import Utils.ConfigReader;
import Utils.ExcelReader;

import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        String path = "Data/config.properties";
        var properties = ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));

        String excelPath = "Data/Test.xlsx";
        var excelData = ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}
