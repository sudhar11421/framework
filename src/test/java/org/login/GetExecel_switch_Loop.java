package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExecel_switch_Loop {
	public static void main(String[] args) throws IOException {

		File file = new File("F:\\FRAME WORK\\Book3.xlsx");

		FileInputStream input = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(input);

		Sheet sheet = book.getSheet("sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				switch(cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"\t");

					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)){
						Date dateCellValue = cell.getDateCellValue(); 
						SimpleDateFormat simple = new SimpleDateFormat("dd/MMM/yyy");
						String format = simple.format(dateCellValue);
						System.out.print(format+"\t");

					}
					else {
						double numericCellValue = cell.getNumericCellValue();
						//Type casting
						//System.out.println(numericCellValue);
						long l=(long)numericCellValue;
						BigDecimal valueOf = BigDecimal.valueOf(l);
						String string = valueOf.toString();
						System.out.print(string+"\t");
					}
					break;

				default:
					System.out.println("none of the above");
					break;

				}

			}
			System.out.println();
		}
	}
}