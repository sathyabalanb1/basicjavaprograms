package basicjavaprogams;

public class Swapusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapUsingThirdVariable(5,10);

	}
	
	public static void swapUsingThirdVariable (int a, int b) {
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		return;
	}

}
