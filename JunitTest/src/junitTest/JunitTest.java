package junitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	@BeforeClass
	public static void loginNetwork() {
		System.out.println("loginNetwork");
	}

	@AfterClass
	public static void loggoutNetwork() {
		System.out.println("loggoutNetwork");

	}

	@Before
	public void openBrowserTest() {
		System.err.println("openBrowserTest");
	}

	@After
	public void closeBrowserTest() {
		System.err.println("closeBrowserTest");
	}

	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}

	@Test
	public void regTest() {
		System.out.println("Reg Test");
	}

	@Test
	public void bookTest() {
		System.out.println("book Test");
	}

}
