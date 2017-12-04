package arraytest;

public class Singledimensionalarray {
        
	public static void main(String[] args) {
		int [] a= new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//System.out.println(a[3]);
		//for (int i=0;i<a.length;i++)//length by defauls it will take the specified integer on the top
		/*{
			System.out.println(a[i]);
		}*/
		
		for(int i=a.length-1;i>=0;i--)//length -1 goes to the int 5 
		{
			System.out.println(a[i]);// print in descending
		}
	}
}
