package Constructortest;//intialising the local variable asign the value to the global variable
//for int=o, for string = null, it will asign by itself

public class constructortest {

	public static int i;
	public static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructortest c= new constructortest();
		int k = i + j;
		System.out.println(k);
		constructortest c = new constructortest();
	}
    
	public constructortest() {
		i = 5; // this is completely knon as default constructor
		j = 5;
	}
}
