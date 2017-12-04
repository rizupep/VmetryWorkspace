package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Justdial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.justdial.com/");
		WebElement site = wd.findElement(By.xpath(".//*[@id='srchbx']"));
		site.sendKeys("school");
		Actions a = new Actions(wd);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		String spath = "html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/section/div/ul/li[";
		String epath = "]/section/div[1]/section/div[1]/h4/span/a/span";
		String spath1 = "html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/section/div/ul/li[";
		String epath1 = "]/section/div[1]/section/div[1]/p[2]/span/a";
		int i = 1;
		while (true) {
			try {
				String xpath = spath + i + epath;
				String xpath1 = spath1 + i + epath1;
				JavascriptExecutor js = (JavascriptExecutor) wd;
				js.executeScript("window.scrollBy(0,1500)");
				WebElement name = wd.findElement(By.xpath(xpath));
				WebElement number = wd.findElement(By.xpath(xpath1));
				String data = name.getText();
				System.out.println(data);
				String data1 = number.getText();
				System.out.println(data1);
				i++;
			} catch (Exception e) {
				break;
			}
		}

	}

}
