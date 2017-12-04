package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollView {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub    // to switch in to another frame and scroll to find a element text
//		WebDriver dr = new FirefoxDriver();
//		dr.manage().window().maximize();
//		dr.get("https://www.w3schools.com/html/html_iframe.asp");
//		dr.switchTo().frame(0);
//		WebElement element = dr.findElement(By
//				.xpath("html/body/div[6]/div[1]/div[2]/div[6]/a"));
//		JavascriptExecutor je = (JavascriptExecutor) dr;
//		je.executeScript("arguments[0].scrollIntoView(true);", element);// particular
//																		// xpath
//		System.out.println(element.getText());
//
//	}
//
//}
//public static void main(String args[]){  
//	  int i,fact=1;  
//	  int number=5;//It is the number to calculate factorial    
//	  for(i=1;i<=number;i++){    
//	      fact=fact*i;    
//	  }    
//	  System.out.println("Factorial of "+number+" is: "+fact);    
//	 }  
//	}  


public static void main(String[] args) 
{
for (int i = 1; i <= 5; i++) 
{
for (int j = 1; j <= i; j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}