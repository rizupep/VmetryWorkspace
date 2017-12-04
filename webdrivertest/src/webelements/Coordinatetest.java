package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coordinatetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
	WebElement pic=	wd.findElement(By.xpath("html/body/div[1]/div[6]/span/center/div[1]/div/div"));
	Point dimens=pic.getLocation();
	System.out.println(dimens);
	int x=dimens.x;
	int y=dimens.y;
	int height =pic.getSize().height;
	int width=pic.getSize().width;
	System.out.println(x);
	System.out.println(y);
	System.out.println(height);
	System.out.println(width);
	}

}
