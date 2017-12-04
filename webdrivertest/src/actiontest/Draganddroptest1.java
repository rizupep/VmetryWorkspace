package actiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddroptest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver ws = new FirefoxDriver();
       ws.manage().window().maximize();
       ws.get("https://jqueryui.com/droppable/");
       ws.switchTo().frame(0);
       WebElement src= ws.findElement(By.xpath(".//*[@id='draggable']"));
       WebElement dest=ws.findElement(By.xpath(".//*[@id='droppable']"));
       Actions a=new Actions(ws);
       Thread.sleep(2000);
       a.dragAndDrop(src, dest).build().perform();
       
	}

}
