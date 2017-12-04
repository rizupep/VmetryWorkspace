package imagingtest;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
	WebElement input=wd.findElement(By.xpath("html/body/div[1]/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
		input.sendKeys("samsung");
		input.submit();
        Thread.sleep(3000);
        String spath = "html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[";
        String epath = "]/div/a[2]";
        String imgspath = "html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[";
	    String imgepath = "]/div/a[1]/div[1]/div/div[1]/img";
       
	    
	    
	    for ( int i=1;i<=3;i++)
	    {
	    	try {
	    		
	    		String xpath = spath+i+epath;
	    		String imgxpath = imgspath+i+imgepath;
	    		WebElement name = wd.findElement(By.xpath(xpath));
	    		String data = name.getText();
	    		System.out.println(data);
	    		WebElement image = wd.findElement(By.xpath(imgxpath));
	    		
	    		Point point = image.getLocation();
	    		System.out.println(point);
	    		int x = point.x;
	    		int y = point.y;
	    		int height = image.getSize().height;
	    		int width = image.getSize().width;

	    		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

	    		BufferedImage copyimg = ImageIO.read(src);

	    		BufferedImage cropimg = copyimg.getSubimage(x, y, width, height);

	    		ImageIO.write(cropimg, "png", src);
	    		FileUtils.copyFile(src, new File(
	    				"D:\\selenium\\webdrivertest\\screenshot\\"+data+".png"));
	    		
	    	}catch (Exception e){
	    		
	    	}
	    }
	}

}
