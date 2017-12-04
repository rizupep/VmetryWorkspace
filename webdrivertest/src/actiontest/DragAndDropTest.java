package actiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/droppable/");
		wd.switchTo().frame(0);
		WebElement src=wd.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement dest=wd.findElement(By.xpath(".//*[@id='droppable']"));
		Actions a=new Actions(wd);
		Thread.sleep(5000);
		a.dragAndDrop(src, dest).build().perform();//when we use actions it is mandatory to have build
		
	}

}
