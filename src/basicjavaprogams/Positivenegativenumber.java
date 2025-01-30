package basicjavaprogams;

public class Positivenegativenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isPositive(1);
		System.out.println(ans);
		
		ans=isPositive(0);
		System.out.println(ans);
		
		System.out.println("-----");
		
		ans=isNegative(-1);
		System.out.println(ans);
		
		ans=isNegative(0);
		System.out.println(ans);
		
		System.out.println("-----");
		
		ans=neitherPositiveOrNegative(0);
		System.out.println(ans);
		
		ans=neitherPositiveOrNegative(-1);
		System.out.println(ans);
		
		System.out.println("------");
		
		int output;
		output=findMiddleElement(8,10);
		System.out.println(output);

	}
	
	public static boolean isPositive (int n) {
		
		return n>0;
	}
	
	public static boolean isNegative (int n) {
		
		return n<0;
	}
	
	public static boolean neitherPositiveOrNegative (int n) {
		
		return n==0;
	}
	
	public static int findMiddleElement (int a, int b) {
		
		int mid;
		
		mid=(a+b)/2;
		
		return mid;
	}

}
