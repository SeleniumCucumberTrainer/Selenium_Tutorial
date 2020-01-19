package ExcelSheetDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelSheet {

	public static void main(String[] args) throws IOException {

		//

		File file = new File("C:\\Users\\akhilesg\\workspace\\SeleniumDemo\\Data\\testData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int totalRows = sheet.getLastRowNum();

		for (int i = 0; i < totalRows+1; i++) {

			XSSFRow row = sheet.getRow(i);

			int totalColumn = row.getLastCellNum();

			for (int j = 0; j < totalColumn; j++) {

				XSSFCell cell = row.getCell(j);

				System.out.print(cell.getStringCellValue()+ "   ");

			}
			
			System.out.println();
		}

	}

}
