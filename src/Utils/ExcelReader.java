package Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    // We created a method in this class so that everytime we need to read the data from the Excel file, we can reuse this method

    public static List<Map<String, String>> read (String path) throws IOException {
        FileInputStream fis = new FileInputStream(path); // Reads the data from the hard drive and brings it to the RAM in the raw form - 10101010101010. In simple words, we can say that the computer has navigated to that file.
        XSSFWorkbook excel = new XSSFWorkbook(fis); // This class converts the raw bytes to the Excel format. In simple words, it is that special software that helps us read and write data to an Excel file.
        Sheet sheet = excel.getSheet("Sheet1");
        int noOfRow = sheet.getPhysicalNumberOfRows();
        Row headerRow = sheet.getRow(0); // Getting the first row so that we can use it as keys for our map
        List<Map<String , String >> excelData = new ArrayList<>(); // The map that will store the data for each row and a list that can hold maps
        for(int rowNo = 1; rowNo < noOfRow; rowNo++)  // A loop that goes through all the rows that contain the data
        {
            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
            Row dataRow = sheet.getRow(rowNo);  // Get dataRow from the sheet one by one through loop
            int noOfCell = dataRow.getPhysicalNumberOfCells(); // Getting the count of how many cells contain the data
            for(int cellNo = 0; cellNo < noOfCell; cellNo++) // A loop to go through all the cells
            {
                String key = headerRow.getCell(cellNo).toString();
                String value = dataRow.getCell(cellNo).toString();
                rowMap.put(key, value);
            }
            excelData.add(rowMap);
            // System.out.println(rowMap);
        }

        return excelData;
    }
}
