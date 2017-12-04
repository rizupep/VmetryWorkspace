package webelements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\webdrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		wd.manage().deleteAllCookies();
		Cookie c1 = new Cookie("company", "vmetry");
		wd.manage().addCookie(c1);
		Set<Cookie> cook = wd.manage().getCookies();
		Iterator<Cookie> it = cook.iterator();
		while (it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getDomain() + "---" + c.getName() + "----"
					+ c.getPath() + "----" + c.getValue() + "----"
					+ c.getExpiry());
		}
	}

}
