package basicjavaprogams;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapTwoNumbers(12,20);

	}
	
	public static void swapTwoNumbers (int a, int b) {
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		return;
		
	}

}
