package parametrisationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multidataprovidertest {
	@Test( priority=1, dataProvider = "Datatest")
	public void logintest(String UserName, String password) {

		System.out.println(UserName);
		System.out.println(password);
		System.out.println("click");
	}

	@DataProvider(name = "Datatest")
	public static Object[][] getdata() {// get data is a function used to get
										// the data
		// void will execute but will not return
		Object[][] data = new Object[3][2];// first id data set
		// first dataset

		data[0][0] = "validusername";
		data[0][1] = "validpassword";
		// second data set
		data[1][0] = "invalidusername";
		data[1][1] = "invalidpassword";
		// third data test
		data[2][0] = "Emptyusername";
		data[2][1] = "Emptypassword";
		return data;
	}

	// data provy or interator array ider return should be single type , array
	// or two dimensional arra
	@Test( priority=2,dataProvider = "Datatest1")
	public void Bookingtest(String movie1, String movie2) {

		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println("submit");
	}

	@DataProvider(name = "Datatest1")
	public static Object[][] getbookdata() {// get data is a function used to
											// get the data
	// void will execute but will not return
		Object[][] data = new Object[3][2];// first id data set
		// first dataset

		data[0][0] = "tamilmovie1";
		data[0][1] = "tamilmovie2";
		// second data set
		data[1][0] = "Englishmovie1";
		data[1][1] = "Englishmovie2";
		// third data test
		data[2][0] = "Hindimovie1";
		data[2][1] = "Hindimovie2";
		return data;
	}
}// data provy or interator array ider return should be single type , array or
	// two dimensional arra

