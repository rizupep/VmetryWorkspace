package webelements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Quittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd=new FirefoxDriver();
	      wd.manage().window().maximize();
	      wd.get("http://book.theautomatedtester.co.uk/chapter1");
	      WebElement window = wd.findElement(By.xpath(".//*[@id='multiplewindow']"));
	      window.click();
	      Set<String> anotherwindow =  wd.getWindowHandles();//to handle more than one window we use handles
	      Iterator<String> it =anotherwindow.iterator();
	     String parentid= it.next();
	     String childid=it.next();
	     wd.switchTo().window(childid);
		wd.quit();
	}

}
