package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Untrustedsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver wd = new FirefoxDriver(profile);
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
	}

}
