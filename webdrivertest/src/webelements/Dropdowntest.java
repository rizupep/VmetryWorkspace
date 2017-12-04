package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_select");
		wd.switchTo().frame(0);
		WebElement dropdown = wd.findElement(By.xpath("html/body/form/select"));
		Select s = new Select(dropdown); //object for dropdown 
		// s.selectByVisibleText("Audi");
		// s.selectByIndex(3);
		// s.selectByValue("fiat");
		/*WebElement fe = s.getFirstSelectedOption();
		String data = fe.getText();
		System.out.println(data);*/
		List<WebElement> option= s.getOptions();
		System.out.println(option.size());
		for (int i=0;i<option.size();i++){
		String data=option.get(i).getText();
			System.out.println(data);
			
		}

	}

}
