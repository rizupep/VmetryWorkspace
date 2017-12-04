package imagingtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screentshottest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      WebDriver ed=new FirefoxDriver();
      ed.manage().window().maximize();
      ed.get("https://jqueryui.com/droppable/");
      
     File src = ((TakesScreenshot)ed).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(src, new File ("D:\\selenium\\webdrivertest\\screenshot\\test.jpg"));
	}

}
