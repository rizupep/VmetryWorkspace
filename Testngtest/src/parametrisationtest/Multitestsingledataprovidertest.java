package parametrisationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multitestsingledataprovidertest {
	@Test( priority=1, dataProvider = "Datatest")
	public void logintest(String UserName, String password , String movie1,String movie2) {

		System.out.println(UserName);
		System.out.println(password);
		System.out.println("click");
	}

	@DataProvider(name = "Datatest")
	public static Object[][] getdata() {// get data is a function used to get
										// the data
		// void will execute but will not return
		Object[][] data = new Object[3][4];// first id data set
		// first dataset

		data[0][0] = "validusername";
		data[0][1] = "validpassword";
		data[0][2] = "tamilmovie1";
		data[0][3] = "tamilmovie2";
		// second data set
		data[1][0] = "invalidusername";
		data[1][1] = "invalidpassword";
		data[1][2] = "Englishmovie1";
		data[1][3] = "Englishmovie2";

		
		// third data test
		data[2][0] = "Emptyusername";
		data[2][1] = "Emptypassword";
		data[2][2] = "Hindimovie1";
		data[2][3] = "Hindimovie2";
		return data;
	}

	// data provider return should be single type , array
	// or two dimensional array or interator array 
	@Test( priority=2,dataProvider = "Datatest")
	public void Bookingtest(String movie1, String movie2,String UserName, String password ) {

		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println("submit");
	}

	
	/*public static Object[][] getbookdata() {// get data is a function used to
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
		return data;*/
	}

