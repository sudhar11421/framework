package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		//To locate workbook
		File F = new File("F:\\FRAME WORK\\Book1.xlsx");

		//TO get file as input
		FileInputStream input = new FileInputStream(F);

		//To get sheet from workbook
		Workbook book = new XSSFWorkbook(input);

		//To get sheet from work book
		Sheet sheet = book.getSheet("Sheet1");

		//TO  get row from sheet

		Row row = sheet.getRow(1);

		Cell cell = row.getCell(0);

		String stringCellValue = cell.getStringCellValue();

		System.out.println(stringCellValue);
	}
}
