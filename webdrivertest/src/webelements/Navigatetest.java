package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigatetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver wd = new FirefoxDriver();
       wd.manage().window().maximize();
      // wd.get("https://www.google.co.in/");
       wd.navigate().to("https://www.bing.com/");//when we open a browser with get , again when we use get it try to open the other url before the firsr browser is completely loaded inorder to avoid that we use navigate
       WebElement input =wd.findElement(By.name("q"));
       input.sendKeys("abc");
       input.submit();//navigate will have forward , backward , refresh
       Thread.sleep(2000);
       wd.navigate().back();
       Thread.sleep(2000);
       wd.navigate().forward();
       Thread.sleep(3000);
       wd.navigate().refresh();//f5 for referesh , by getting the current url and pasting the same url again 
	}

}
