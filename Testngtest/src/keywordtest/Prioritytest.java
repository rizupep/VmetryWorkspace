package keywordtest;

import org.testng.annotations.Test;

public class Prioritytest {
@Test (priority=1)
	 public void logintest(){
		   System.out.println("login test completed");
	   }
@Test(priority=2)
	 public void bookingtest(){
		   System.out.println("booking completed ");
	   }
@Test(priority=3)
	 public void registrationtest(){
		   System.out.println("registration test completed");
	   }
@Test(priority=4)
	 public void logouttest(){
		   System.out.println("login test completed");
	   }
}
