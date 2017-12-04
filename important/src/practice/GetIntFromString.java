package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetIntFromString {
	
	

	    public static void main(String[] args) {
	    	WebDriver  rd= new FirefoxDriver();
	    	rd.manage().window().maximize();
	    	rd.get("https://en.wikipedia.org/wiki/Main_Page");
	    WebElement notes=	rd.findElement(By.xpath(".//*[@id='mp-tfa']/p"));
	    String str = notes.getText();
	    String numberOnly = str.replaceAll("[^0-9]", "");
	 
	    	   System.out.println(numberOnly);

	       // System.out.println("input [" + input + "], output [" + output + "]");
	    }

}
