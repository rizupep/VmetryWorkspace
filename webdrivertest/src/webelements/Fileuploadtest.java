package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// robotic,autoit(browseos compatibility,sikully(image comparison but conflicts in parelel running
public class Fileuploadtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.tinyupload.com/");
	    WebElement input	=wd.findElement(By.xpath("html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
        input.sendKeys("D:\\selenium\\webdrivertest\\browser\\chromedriver.exe"); 
	}

}
