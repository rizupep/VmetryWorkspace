package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\User\\Desktop\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// int row = sheet.getLastRowNum() + 1;
		// int col = sheet.getRow(0).getLastCellNum();
		String username = sheet.getRow(1).getCell(1).getStringCellValue();
		String password = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.facebook.com/login/");
		wd.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
		wd.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);

		// System.out.println(row);
		// System.out.println(col);
		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < col; j++) {
		// if (sheet.getRow(i).getCell(j) != null) {
		// // sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
		// if (sheet.getRow(i).getCell(j).getCellType() ==
		// Cell.CELL_TYPE_STRING) {
		// String data = sheet.getRow(i).getCell(j)
		// .getStringCellValue();
		// System.out.print(data + " ");
		// } else if (sheet.getRow(i).getCell(j).getCellType() ==
		// Cell.CELL_TYPE_NUMERIC)// blank
		// // cell
		// {
		// int data = (int) sheet.getRow(i).getCell(j)
		// .getNumericCellValue();
		// System.out.println(data + " ");
		// }
		//
		// }
		//
		// }
		//
		// }
		//
		// fis.close();
		// FileOutputStream fos = new FileOutputStream(f);
		// sheet.getRow(1).getCell(1).setCellValue("abcm");
		// workbook.write(fos);
		// fos.close();
		// System.out.println("  ");

	}
}
