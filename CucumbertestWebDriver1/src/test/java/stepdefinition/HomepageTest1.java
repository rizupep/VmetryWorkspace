package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageTest1 {
	
	WebDriver wd;
	
	@Given( "^Open Browser as (.*)$")
	public void openBrowser(String Browser){
		wd= new FirefoxDriver();
		//System.out.println(" i am opening the browser"+Browser);
	}
	@cucumber.api.java.en.Then("^Enter URL as (.*)$")
	public void enterurl(String URL){
		wd.get(URL);
		//System.out.println("i am entering the url"+URL);
	}
	@cucumber.api.java.en.Then ("^Enter UserName as (.*)$")
	public void enterUsername(String UserName){
		wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]")).sendKeys(UserName);
		//int i=1/0;// this info will fail the test
		//System.out.println("i am entering the user name"+UserName);
	}
	@cucumber.api.java.en.Then( "^EnterMobileno as (.*)$")
	public void enterMobileno(String Mobileno){
		wd.findElement(By.xpath(".//*[@id='mobid']")).sendKeys(Mobileno);
		//System.out.println("i am entering the mobile number "+Mobileno);
	}
	@Then("^Enter PickupAdd as (.*)$")
	public void pickupAdd (String Pickupadd){
		wd.findElement(By.xpath(".//*[@id='pickid']")).sendKeys(Pickupadd);
		//System.out.println(" i am choosing pickup address"+Pickupadd);
	}
	@And ("^Enter DropAdd as (.*)$")
	public void enterDropAdd (String Dropadd){
		wd.findElement(By.xpath(".//*[@id='dropid']")).sendKeys(Dropadd);
		//System.out.println("i am choosing drop address"+Dropadd);
	}
	@When ("^Select the Vehicle Type as (.*)$")
	public void selectVehicleType (String Vehicletype){
		 WebElement drop= wd.findElement(By.xpath(".//*[@id='vehid']"));
		Select s = new Select(drop);
		s.selectByVisibleText(Vehicletype);
		
		//System.out.println("i am selecting the vehicle"+Vehicletype);
	}
	@Then ("^Click the BookLater CheckBox$")
	public void clickBookLater (){
		wd.findElement(By.xpath(".//*[@id='bookLater']")).click();
		//System.out.println("i clicking the check box");
	}
	@But ("^Don't Click BookButton$")
	public void dontClickBookbutton (){
		//System.out.println("dont click");
	}

}

