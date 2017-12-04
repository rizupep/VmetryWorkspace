package locatortest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
	WebElement input=wd.findElement(By.name("q"));
	input.sendKeys("abc");
	input.sendKeys(Keys.ENTER);//keys .enter is stored in enumeration directly we can call
	}

}
