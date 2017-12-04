package locatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Currenturltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in");
		String data =wd.getCurrentUrl();
		System.out.println(data);
	}

}
