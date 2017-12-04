package resizetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/resizable/");
		wd.switchTo().frame(0);
		WebElement src=wd.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		Actions a=new Actions(wd);
		a.clickAndHold(src).build().perform();
		Thread.sleep(5000);
		a.moveToElement(src, 80, 80).release().build().perform();
		//a.release(src).build().perfrom();need to mention the webelement if given seperate 
	}

}
