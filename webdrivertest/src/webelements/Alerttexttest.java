package webelements;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerttexttest {//it will not have url, it is with in a browser page but popup will interacted with the server it can be used on other page 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wd.switchTo().frame(0);
		WebElement alert= wd.findElement(By.xpath("html/body/button"));
		alert.click();
		Thread.sleep(5000);
      Alert a=wd.switchTo().alert();
		String data =a.getText();
		System.out.println(data);
		a.accept();//this for click ok in alert
		//a.dismiss();// this is for cancel in alert
		
	}

}
