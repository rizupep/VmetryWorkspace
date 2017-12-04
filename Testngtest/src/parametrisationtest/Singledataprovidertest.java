package parametrisationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Singledataprovidertest {
@Test(dataProvider="Datatest")
	public void logintest (String UserName,String password){
		
		System.out.println(UserName);
		System.out.println(password);
		System.out.println("click");
	}
@DataProvider (name = "Datatest")
public static Object[] [] getdata(){//get data is a function used to get the data
	// void will execute but will not return 
	Object [] [] data = new Object [3][2];// first id data set 
	// first dataset
	
	data [0][0] = "validusername";
	data [0][1]=  "validpassword";
	//second data set
	data [1][0]= "invalidusername";
	data [1][1]= "invalidpassword";
	//third data test  
	data [2][0]= "Emptyusername";
	data [2][1]= "Emptypassword";
	return data;
}
}// data provy or interator array ider return should be  single type , array or two dimensional arra
