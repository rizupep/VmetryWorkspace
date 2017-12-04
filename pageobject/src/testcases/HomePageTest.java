package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest {
	WebDriver wd;
	@BeforeClass
	public void setup(){
		wd=new FirefoxDriver();
	}
    @Test  (dataProvider="datatest")      
	public  void regtest(String username , String mobno ,String picadd , String dropadd , String vtype ){
	//implelement parametrisation in the given task for running three datas in data providers
	WebDriver wd = new FirefoxDriver();
    wd.manage().window().maximize();
    HomePage.loadurl(wd, "http://www.ntltaxi.com/");
    HomePage.enterusername(wd, username);
    HomePage.entermobilenumber(wd, mobno);
    HomePage.enterpickupplace(wd, picadd);
    HomePage.enterdropplace(wd, dropadd);
    HomePage.selectvtype(wd, vtype);
    HomePage.clickbooklater(wd);
}
    @DataProvider(name ="datatest")
	public static Object [][] getdata () {
		
		Object [][] data = new Object [3][5];
		
		data [0][0]="vmetrya";
		data [0][1] = "12345678";
		data [0][2]= "ADYAR";
		data [0][3]= "ADYAR";
		data [0][4]= "Sedan";
		
		
		data [1][0]="vmetryb";
		data [1][1] = "12345678";
		data [1][2]= "ADYAR";
		data [1][3]= "ADYAR";
		data [1][4]= "Sedan";
		
		data [2][0]="vmetryc";
		data [2][1] = "12345678";
		data [2][2]= "ADYAR";
		data [2][3]= "ADYAR";
		data [2][4]= "Sedan";
		return data;
		
	}
}
