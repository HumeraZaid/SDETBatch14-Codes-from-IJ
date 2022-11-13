package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {

    public static void main(String[] args) throws IOException {

        String path = "Data/Test.xlsx"; // We need to know the path of the file
        FileInputStream fileInputStream = new FileInputStream(path); // Navigate to this path
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream); // A special class that can handle xlsx files
        Sheet sheet = excelFile.getSheet("Sheet1"); // Get the sheet inside the Excel file where the data is stored
        Row row0 = sheet.getRow(0); // Get the row that contains the data. Rows are index based, so they will start from zero.
        System.out.println(row0.getCell(0)); // Get the cell (column) that contains the data. Cells are also index based

        Row row1 = sheet.getRow(1); // Get the data from row 1
        System.out.println(row1.getCell(0)); // Get the data from cell 0
    }
}
