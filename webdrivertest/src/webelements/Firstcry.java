package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstcry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.firstcry.com/");
		
		//wd.findElement(By.className("_pop_close _pop_reg_bg")).click();
		// wd.findElement(By.xpath(".//*[@id='webklipper-publisher-widget-container-notification-close-div']/span")ck();
		WebElement search = wd.findElement(By.xpath(".//*[@id='search_box']"));
		search.sendKeys("sandals");
		search.submit();
		
		List<WebElement> frame =wd.findElements(By.tagName("iframe"));
		
	}

}
