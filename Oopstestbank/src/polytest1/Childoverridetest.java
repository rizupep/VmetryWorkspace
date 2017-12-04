package polytest1;

public class Childoverridetest extends ParentOverridetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childoverridetest c = new Childoverridetest();
		c.calc();
	}

	public static void add() {
		System.out.println("child add");
	}

	public void calc()// when we make change in static in child we have t o
						// modify in parent also
	{
		super.add();// calls parent class
		add();// calls child or current class
		this.add();// calls child class,and it is mostly used in constructor
		// super and this can only be called in not static but not in static

	}

}
