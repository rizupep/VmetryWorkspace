package imagingtest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Croptest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
		WebElement pic = wd.findElement(By
				.xpath("html/body/div[1]/div[6]/span/center/div[1]/div/a/img"));
		Point point = pic.getLocation();
		System.out.println(point);
		int x = point.x;
		int y = point.y;
		int height = pic.getSize().height;
		int width = pic.getSize().width;
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		BufferedImage copyimg = ImageIO.read(src);

		BufferedImage cropimg = copyimg.getSubimage(x, y, width, height);

		ImageIO.write(cropimg, "png", src);
		FileUtils.copyFile(src, new File(
				"D:\\selenium\\webdrivertest\\screenshot\\crop.png"));

	}

}
