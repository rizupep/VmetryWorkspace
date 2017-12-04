package paralleltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexecutiontest {
	WebDriver wd;

	@Parameters({ "browser" })
	// this name should be given in suite name
	@BeforeTest
	public void setup(String browser) {
		if (browser.equals("Firefox")) {
		wd = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\webdrivertest\\browser\\chromedriver.exe");
			wd = new ChromeDriver();
		}
	}

	@Test
	public void logintest() throws InterruptedException {

		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input = wd
				.findElement(By
						.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		input.sendKeys("abc");
		input.submit();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
	}
}
