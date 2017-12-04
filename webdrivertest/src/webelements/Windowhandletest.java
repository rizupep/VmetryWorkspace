package webelements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandletest {

	public static void main(String[] args) throws InterruptedException {
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
     WebElement text = wd.findElement(By.xpath(".//*[@id='popuptext']"));
     String data =text.getText();
     System.out.println(data);
     Thread.sleep(3000);
     WebElement closetext = wd.findElement(By.xpath(".//*[@id='closepopup']"));
     closetext.click();
     wd.switchTo().window(parentid);
     WebElement loadtext = wd.findElement(By.xpath(".//*[@id='secondajaxbutton']"));
     loadtext.click();
     //wd.switchTo().defaultContent();it will come to the parent window by default
	}

}
