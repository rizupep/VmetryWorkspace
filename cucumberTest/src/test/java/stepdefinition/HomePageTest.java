package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest {
	@Given( "^Open Browser as (.*)$")
	public void openBrowser(String Browser){
		System.out.println(" i am opening the browser"+Browser);
	}
	@cucumber.api.java.en.Then("^Enter URL as (.*)$")
	public void enterurl(String URL){
		System.out.println("i am entering the url"+URL);
	}
	@cucumber.api.java.en.Then ("^Enter UserName as (.*)$")
	public void enterUsername(String UserName){
		//int i=1/0;// this info will fail the test
		System.out.println("i am entering the user name"+UserName);
	}
	@cucumber.api.java.en.Then( "^EnterMobileno as (.*)$")
	public void enterMobileno(String Mobileno){
		System.out.println("i am entering the mobile number "+Mobileno);
	}
	@Then("^Enter PickupAdd as (.*)$")
	public void pickupAdd (String Pickupadd){
		System.out.println(" i am choosing pickup address"+Pickupadd);
	}
	@And ("^Enter DropAdd as (.*)$")
	public void enterDropAdd (String Dropadd){
		System.out.println("i am choosing drop address"+Dropadd);
	}
	@When ("^Select the Vehicle Type as (.*)$")
	public void selectVehicleType (String Vehicletype){
		System.out.println("i am selecting the vehicle"+Vehicletype);
	}
	@Then ("^Click the BookLater CheckBox$")
	public void clickBookLater (){
		System.out.println("i clicking the check box");
	}
	@But ("^Don't Click BookButton$")
	public void dontClickBookbutton (){
		System.out.println("dont click");
	}

}
