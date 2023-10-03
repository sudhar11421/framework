package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcel {

public static void main(String[] args) throws IOException {
	
	//To locate workbook
		File F = new File("F:\\FRAME WORK\\Book2.xlsx");
		
		//TO get file as input
		FileInputStream input = new FileInputStream(F);
		
		//To get sheet from workbook
		Workbook book = new XSSFWorkbook(input);
		
		//To get sheet from work book
		Sheet sheet = book.getSheet("Sheet1");

		//iterate to get physical number of cell
		for(int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			 Cell cell = row.getCell(j);
			 
        String stringCellValue = cell.getStringCellValue();
	
		System.out.print(stringCellValue+"\t");
			 
				
			}
		
		System.out.println();	
		}
		
}

}
