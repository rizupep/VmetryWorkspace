package parametrisationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Multidataproviderresolvedtest {
	String movie1;
	String movie2;
	String UserName;
	String password;
//constructor
	@Factory(dataProvider = "Datatest") //should be given to consider constructort test and to overcome dataprovider
	public Multidataproviderresolvedtest(String movie1, String movie2,String UserName, String password ){
		this.UserName = UserName;
		this.password= password;
		this.movie1 = movie1;
		this.movie2 = movie2;
	}
	@Test(priority = 1)
	public void logintest() {

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

	// data provy or interator array ider return should be single type , array
	// or two dimensional arra
	@Test(priority = 2)
	public void Bookingtest() {

		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println("submit");
	}

}