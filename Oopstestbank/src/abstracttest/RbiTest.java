package abstracttest;

public abstract class RbiTest {
	public  abstract void credit();// looks like interface 
	//in abstract class we can declare a method but we cannot define a method , in order to define it
	//we have to create a another class and we have to implement and override it 
	public static void debit()//  looks like inheritance
	{
		System.out.println("debit");
	}
	public static void loan(){
		System.out.println("loan");
	}
}
