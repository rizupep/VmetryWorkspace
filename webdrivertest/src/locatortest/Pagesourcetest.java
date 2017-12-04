package locatortest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pagesourcetest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in");
		String data = wd.getPageSource();
		//System.out.println(data);//write this text in a notepad
		FileWriter fr=new FileWriter("C:\\Users\\User\\Desktop\\notepadexample.txt");
		BufferedWriter br=new BufferedWriter(fr);
		br.write(data);
		br.close();
	}

}
