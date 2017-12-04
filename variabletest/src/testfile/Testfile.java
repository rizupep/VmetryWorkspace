package testfile;
//with out main method we can run a program using static block

public class Testfile {
	{
		System.out.println("normal block");
	}
	static {
		System.out.println("static block");
	}

	public Testfile() {
		System.out.println("constructor block");
	}

	public static void add() {
		System.out.println("add func");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Testfile t= new Testfile();
	}

}
