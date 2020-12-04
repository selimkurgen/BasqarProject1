package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {


    public List<List<String>> getExcelData(String excelName, String sheetName){

        List<List<String>> mainLists = new ArrayList<>();

        String path="src/main/resources/ApacheExcel1.xlsx" + excelName;


        FileInputStream inputStream = null;
        Workbook workbook= null;

        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet= workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for(int i=1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            List<String> innerList = new ArrayList<>();
            for(int j=0 ;j< cellCount; j++) {
                Cell cell = row.getCell(j);
                innerList.add(cell.getStringCellValue());
            }
            mainLists.add(innerList);
        }
        return mainLists;
    }


    public List<String> getExcelData(String excelName, String sheetName, int returnRowNumber){

        List<String> list = new ArrayList<>();

        String path="src/test/resources/" + excelName;


        FileInputStream inputStream = null;
        Workbook workbook= null;

        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet= workbook.getSheet(sheetName);

        Row row = sheet.getRow(returnRowNumber);
        for(int j=0 ; j<2; j++) {
            Cell cell = row.getCell(j);
            list.add(cell.getStringCellValue());
        }
        return list;
    }
}
