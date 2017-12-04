package imagingtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshottest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");

		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);// casting
																			// convetring
																			// a
																			// value
																			// into
																			// double
																			// integer//
		// Convert web driver object to TakeScreenshot

		// Call getScreenshotAs method to create image file
		FileUtils.copyFile(src, new File(
				"D:\\selenium\\webdrivertest\\screenshot\\test.jpg"));
		// file utils has to be taken from apache
		/*
		 * In order to have the method, the driver must implement the
		 * TakesScreenshot interface which makes it capable to ... well ... take
		 * screenshots.
		 * 
		 * Therefore, you must tell the program somehow that you want to take a
		 * screenshot and that you are absolutely sure you can do so. That's
		 * what the (TakesScreenshot)driver part is for. In Java, it's called
		 * casting and it literally translates to "I know that this driver
		 * instance is able to take a screenshot, please cast it to
		 * TakesScreenshot type."
		 * 
		 * If your cast succeeds, everything is fine and the driver object will
		 * be cast at run-time to an instance of TakesScreenshot. If your cast
		 * fails, however, you'll get a ClassCastExcepion at run-time.
		 */
	}

}
