package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> radio= wd.findElements(By.name("group1"));
		for(int i=0;i<radio.size();i++){
		String data=radio.get(i).getAttribute("value");
		System.out.println(data);
			//if(data.equals("Milk")){
			//	radio.get(i).click();
		//	}
		}
	}

}
