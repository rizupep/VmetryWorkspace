package encapTest;

public class EncapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapTest e=new EncapTest();
		
		e.setAge(10);
		e.setName("abc");
		System.out.println(e.getAge());
		System.out.println(e.getName());
		
		String a="vmetry";
		String b="vmetry";
		String c= new String("vmetry");


		System.out.println(a==b);// li
		System.out.println(a==c);//ob
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
