package actiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseovertest {

	public static void main(String[] args) throws InterruptedException {//find element -webelemtn or //find elements -list of webelement
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.doosan.com/en/");
		WebElement corpprofile = wd.findElement(By.xpath(".//*[@id='menu-gnb']/li[3]/a/span[1]"));
		WebElement leadership = wd.findElement(By.xpath(".//*[@id='menu-gnb']/li[3]/ul/li[1]/a"));
		WebElement executiveteam = wd.findElement(By.xpath(".//*[@id='menu-gnb']/li[3]/ul/li[1]/ul/li[2]/a"));
		Actions a = new Actions(wd);
		a.moveToElement(corpprofile).build().perform();
		Thread.sleep(2000);
		a.moveToElement(leadership).build().perform();
		Thread.sleep(2000);
		a.moveToElement(executiveteam).click().build().perform();
	}

}
