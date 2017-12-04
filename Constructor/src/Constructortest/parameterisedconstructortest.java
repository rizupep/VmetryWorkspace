package Constructortest;

public class parameterisedconstructortest {
	public static int a;
	public static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterisedconstructortest p = new parameterisedconstructortest();
		int c = a + b;
		System.out.println(c);

		parameterisedconstructortest p1 = new parameterisedconstructortest(10,
				10);
		int c1 = a + b;
		System.out.println(c1);

		parameterisedconstructortest p3 = new parameterisedconstructortest(100,
				100);
		int c2 = a + b;
		System.out.println(c2);
	}

	public parameterisedconstructortest(int a,int b)
	{
		this.a=10;
		this.b=10;
	}
	public parameterisedconstructortest()
	{
		a=5;
		b=5;
	}

}
