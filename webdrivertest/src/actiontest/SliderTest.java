package actiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/slider/");
		wd.switchTo().frame(0);
		WebElement src = wd.findElement(By.xpath(".//*[@id='slider']/span"));
		Actions a= new Actions(wd);
		
		int i =10;
		while(true){
			
		
		a.dragAndDropBy(src, 80, 0).build().perform();
		i=i+10;
		Thread.sleep(4000);
		}
	}

}
