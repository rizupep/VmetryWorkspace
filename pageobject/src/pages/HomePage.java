package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static void loadurl(WebDriver wd, String url) {// boolean should be
															// started with is

		wd.get(url);
	}

	public static void enterusername(WebDriver wd, String username) {
		wd.findElement(
				By.xpath("html/body/section/div/div[2]/div/form/input[2]"))
				.sendKeys(username);
	}

	public static void entermobilenumber(WebDriver wd, String mobilenumber) {
		wd.findElement(By.xpath(".//*[@id='mobid']")).sendKeys(mobilenumber);
	}

	public static void enterpickupplace(WebDriver wd, String pickupplace) {
		wd.findElement(By.xpath(".//*[@id='pickid']")).sendKeys(pickupplace);
	}

	public static void enterdropplace(WebDriver wd, String dropplace) {
		wd.findElement(By.xpath(".//*[@id='dropid']")).sendKeys(dropplace);
	}

	public static void selectvtype(WebDriver wd, String vtype) {
		WebElement drop = wd.findElement(By.xpath(".//*[@id='vehid']"));
		Select s = new Select(drop);
		s.selectByVisibleText(vtype);
	}

	public static void clickbooklater(WebDriver wd) {
		wd.findElement(By.xpath(".//*[@id='bookLater']")).click();
	}

}
