package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ambanitest {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			WebDriver wd=new FirefoxDriver();
			wd.manage().window().maximize();
			wd.navigate().to("https://en.wikipedia.org/wiki/Dhirubhai_Ambani");
			WebElement input= wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/p[4]"));
			String p=input.getText();
			System.out.println(p);
			String value="Ambani";
			if(p.contains(value))
			{	
			System.out.println("PASS");
			}
			else
			{
			
		System.out.println("FAIL");		
			}
			
		}
			
			
			
		}

