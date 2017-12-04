package excelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
        WebDriver wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.get("https://www.facebook.com/login/");
        wd.findElement(By.xpath(".//*[@id='email']")).sendKeys();
        
	}

}
