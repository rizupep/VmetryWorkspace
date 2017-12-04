package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_checked");
		wd.switchTo().frame(0);
		WebElement check= wd.findElement(By.xpath("html/body/form/input[1]"));
		if (check.isDisplayed()){
			System.out.println("check box is displayed");
		}
		if (check.isEnabled()){
			System.out.println("check box is enabled");
		}
		if (!check.isSelected()){
			System.out.println("check box is not selected");
			check.click();
		}
	}

}
