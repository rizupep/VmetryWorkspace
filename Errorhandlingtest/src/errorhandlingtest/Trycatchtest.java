package errorhandlingtest;

public class Trycatchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("errorhandlingtest");
		try {
			int[] a = new int[1];
			a[0] = 10;
			// a[1]=20;
			 int i= 1/0;

		System.exit(1);
		
		}

		catch (ArithmeticException e) {
			System.out.println("invalid number entered" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array size in invalid" +e.getMessage());
		} catch (Exception e) {
			System.out.println("sorry something went wrong" + e.getMessage());
		} catch (Throwable t) {
			System.out.println("unexpected error" + t.getMessage());
		} finally {
			System.out.println("finally done");
		}
		System.out.println("errorhandlingcompleted");
	}

}
