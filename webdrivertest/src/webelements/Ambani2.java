package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ambani2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://en.wikipedia.org/wiki/Dhirubhai_Ambani");
		//WebElement input= wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/p[4]"));
		WebElement input= wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/p[1]"));
		String p=input.getText();
		System.out.println(p);
		//String value="Ambani";
		//String []s1=str.split(" ");
		//int count=0;
		String []d = p.split("Ambani");
		
		System.out.println(d.length -1);
//	       for(int i=0;i<=d.length -1;i++) {
//          if(d[i].equals("is")) {
//	               count++; 
//         }
//	       }	       
	}
		
		
		
	}

