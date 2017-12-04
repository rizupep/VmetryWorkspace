package errorhandlingtest;

public class Throwtest { //used for creating error

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int age = 17;
		if (age<18){
			throw new Exception("Under 18");//it is mandatory to use throws when you are using throw to declare 
		}
	}

}
