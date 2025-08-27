package utils;

import io.cucumber.core.options.Constants;
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

    public static List<Map<String,String>> read(String path, String sheetName) throws IOException {

        // To Bring the data from file into the java program
        List<Map<String, String>> excelData = new ArrayList<>();


        try {
            FileInputStream fis = new FileInputStream(path);

            //.xlsx - XSSF, .xls -HSSF
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);

            //Maybe there can be  lots of sheets we are getting the sheet1 from Excel
            Sheet sheet = xssfWorkbook.getSheet(sheetName);

            //This line is getting the number of actual rows that contains the data
            int noOfActualRowsWithData = sheet.getPhysicalNumberOfRows();

            //This Line is getting the row number 0 as will be using this for all the maps as keys
            Row headerRow = sheet.getRow(0);

            //This loop  is going through all the rows
            for (int i = 1; i < noOfActualRowsWithData; i++) {

                //This line is getting each row one by one from the map
                Row currentRow = sheet.getRow(i);

                //This line is new Map for every row
                Map<String, String> rowMap = new LinkedHashMap<>();

                //This line is the actual no of cells that contains the data in each row
                int noOfActualCellsWithData = currentRow.getPhysicalNumberOfCells();

                //This nested loop is going through all the cells
                for (int j = 0; j < noOfActualCellsWithData; j++) {

                    //We get the keys from Header
                    String key = headerRow.getCell(j).toString();

                    //We get the values from current row
                    String value = currentRow.getCell(j).toString();

                    //we store these keys and values in the map
                    rowMap.put(key, value);
                }
                //We store each map in the list
                excelData.add(rowMap);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return excelData;

    }


    public static List<Map<String,String>> read(String sheetName) throws IOException{
        return read(Constants.EXCEL_FILE_PATH,sheetName);
    }

    public static  List<Map<String,String>> read() throws IOException{
        return  read(Constants.EXCEL_FILE_PATH, "Sheet1");
    }
}