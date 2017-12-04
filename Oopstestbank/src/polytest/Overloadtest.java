package polytest;

public class Overloadtest {
	//In Java it is possible to define two or more methods within the same class which share the same name, as long as their parameter declarations are different. When this is the case, the methods are said to be overloaded and the process is referred to as  Method Overloading.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(1,1,1);
add(1, 1);
  
add(1,1,"Addition of 2 number is:");
	}
	
	public static void add (int i,int j)
	
	{
		
		int k=i+j;
		System.out.println(k);
	}


public static void add ( int i,int j,int z)

{
	
	int k=i+j+z;
	System.out.println(k);
}

public static void add ( int i,int j,String msg)

{
	
	int k=i+j;
	System.out.println(msg+k);
}
}