package variabletest;

public class vtest1 {
	 int i = 1;// global variable should have public static ,
							// declared before mainmethod
	 int j = 1;
//instance variable can used if there is object is created only 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=1;//local variable cannot be extended to other functions , it
		// will function with in a variable
		// int j=1;
		vtest1 v= new vtest1();//(this is instance example)
		int k =v. i +v. j;
		System.out.println(k);
	}

	public static void add() {
		int z = i + j;
		System.out.println(z);
	}

}
