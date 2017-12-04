package grouptest;

import org.testng.annotations.Test;

public class Grouping {
	@Test(priority = 1, groups = { "book", "cancel" })
	public void logintest() {
		System.out.println("login completed");
	}

	@Test(priority = 2, groups = { "book" })
	public void registrationtest() {
		System.out.println("reg completed");
	}

	@Test(priority = 3, groups = { "book", "cancel" })
	public void bookingtest() {
		System.out.println("booking completed");
	}

	@Test(priority = 4, groups = { "cancel" })
	public void canceltest() {
		System.out.println("cancel completed");
	}

}
