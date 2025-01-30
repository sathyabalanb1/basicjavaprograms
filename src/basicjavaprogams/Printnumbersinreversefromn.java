package basicjavaprogams;

public class Printnumbersinreversefromn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbersInReverseFromN(10);

	}
	
	public static void printNumbersInReverseFromN (int n) {
		
		int num=n;
		
		while(num>=1) {
			System.out.print(num+" ");
			num--;
		}
		
		System.out.println();
		return;
	}

}
