package practice;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1;
		int next=1;
		System.out.print(first + "," + second);
		int maxval=100;
		while(first+second <=maxval)
		{
		next=first + second;
		System.out.print("," + next);
		first=second;
		second=next;
		}
	}

}
