package Class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo1 {

    public static void main(String[] args) throws IOException {

        String path = "Data/Test.xlsx"; // Location of the file on your hard drive, where file is stored
        FileInputStream fis = new FileInputStream(path); // Reads the data from the hard drive and brings it to the RAM in the raw form - 10101010101010. In simple words, we can say that the computer has navigated to that file.
        XSSFWorkbook excel = new XSSFWorkbook(fis); // This class converts the raw bytes to the Excel format. In simple words, it is that special software that helps us read and write data to an Excel file.
        Sheet sheet = excel.getSheet("Sheet1");
        int noOfRow = sheet.getPhysicalNumberOfRows();
        Row headerRow = sheet.getRow(0); // Getting the first row so that we can use it as keys for our map
        ArrayList<LinkedHashMap<String, String>> excelData = new ArrayList<>(); // The map that will store the data for each row and a list that can hold maps
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

        System.out.println(excelData);

    }
}
