package polytest1;

public class Childoverridetest1 extends Childoverridetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childoverridetest1 c=new Childoverridetest1();
c.calc();
	}

	public static void  add()
	{
		System.out.println("child add1");
		
	}
	public void calc()
	{
		super.add();//calls immediate parent 
	}
}
