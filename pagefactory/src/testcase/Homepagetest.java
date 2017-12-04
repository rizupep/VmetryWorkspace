package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import page.Homepage;

public class Homepagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
	    wd.manage().window().maximize();
	    Homepage.loadurl(wd, "http://www.ntltaxi.com/");
	    Homepage homePage = PageFactory.initElements(wd, Homepage.class);
	    homePage.enterusername("abc");
	    homePage.entermobilenumber("12345678");
	    homePage.enterpickupplace("ADYAR");
	    homePage.enterdropplace("VELACHERY");
	    homePage.entervtype("Sedan");
	    homePage.clickbooklater();
	}

}
