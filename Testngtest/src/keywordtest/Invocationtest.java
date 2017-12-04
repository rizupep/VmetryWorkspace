package keywordtest;

import org.testng.annotations.Test;

public class Invocationtest {

	@Test (invocationCount =100)
	public void logintest(){
		
		System.out.println("login test");
	}
}
