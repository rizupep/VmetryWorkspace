package autoittest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//task in windows authentication in both selenium and autoit 
public class Uploadtest {
           
	 public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver wd = new FirefoxDriver();
			wd.manage().window().maximize();
			wd.get("http://www.tinyupload.com/");
			WebElement input = wd.findElement(By
					.xpath("html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
			input.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\Upload.exe");
	}
}
