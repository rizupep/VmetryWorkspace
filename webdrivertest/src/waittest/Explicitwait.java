package waittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebDriverWait  wait= new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[10]")));
		WebElement input=wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[10]"));
		input.sendKeys("abc");
	}

}

