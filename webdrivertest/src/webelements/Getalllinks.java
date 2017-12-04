package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getalllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
	    List<WebElement> link= wd.findElements(By.tagName("a"));//<input> common for check box ,text,radio button and all elements
	    for(int i=0;i<link.size();i++)
	    {
	    String data=link.get(i).getText();
	    //if data==null) //memory not created
	    //if data.equals(" ") space memory created , value is deleted
	    //if data!=
	    
	    if (!data.isEmpty()){//value is empty link is not there ,that y we are getting space in order to avoid it we are using empty  , or if it is created and deleted we can use null
	    	
	    
	    System.out.println(data);
	    }
	}
}
}