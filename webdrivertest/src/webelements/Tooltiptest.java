package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltiptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/tooltip/");
		wd.switchTo().frame(0);
		WebElement box = wd.findElement(By.xpath(".//*[@id='age']"));
		String data = box.getAttribute("title");
        System.out.println(data);
	}

}
