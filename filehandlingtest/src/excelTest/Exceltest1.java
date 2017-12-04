package excelTest;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltest1 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\User\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum() + 1;
		int col = sheet.getRow(0).getLastCellNum();
		// System.out.println(row);
		// System.out.println(col);
		for (int rownum = 0; rownum < row; rownum++) {
			for (int cellnum = 0; cellnum < col; cellnum++) {
				if ( sheet.getRow(rownum).getCell(cellnum) !=null){
				    
				
			//sheet.getrow(rownum).getcell(cellnum).setCellType(Cell.CELL_TYPE_STING  output 465.0 wrong value
				 if (sheet.getRow(rownum).getCell(cellnum).getCellType() == Cell.CELL_TYPE_STRING) {
					String data = sheet.getRow(rownum).getCell(cellnum)
							.getStringCellValue();
					System.out.print(data + " ");
				} else if (sheet.getRow(rownum).getCell(cellnum).getCellType() == Cell.CELL_TYPE_NUMERIC) {
					int data = (int) sheet.getRow(rownum).getCell(cellnum)
							.getNumericCellValue();
					System.out.print(data + " ");
				} 
			 }
			}
			System.out.println("  ");
		}
	
	}
}

