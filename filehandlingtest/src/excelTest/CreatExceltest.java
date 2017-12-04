package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import java.io.FileNotFoundException;

public class CreatExceltest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\User\\Desktop\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("Vmetry");
		XSSFRow row = sheet.createRow(1);
		XSSFCell cell = row.createCell(2);
		cell.setCellValue("test1");
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		

	}

}
