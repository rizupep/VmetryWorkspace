package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocompletetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/autocomplete/");
		wd.switchTo().frame(0);
		WebElement input = wd.findElement(By.xpath(".//*[@id='tags']"));
		input.sendKeys("a");
		Thread.sleep(2000);
		String sxpath = "html/body/ul/li[";
		String expath=	"]/div";
		int i=1;
		while (true)
		{
			try
			{
			String xpath = sxpath+i+expath;
			WebElement text=wd.findElement(By.xpath(xpath));
			String data = text.getText();
			System.out.println(data);
			i++;
			}
			catch(Exception e)
			{
				break;
			}
		}
	}

}
