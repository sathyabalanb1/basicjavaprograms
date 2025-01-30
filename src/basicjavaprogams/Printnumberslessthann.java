package basicjavaprogams;

public class Printnumberslessthann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbersLessThanN(8);

	}
	
	public static void printNumbersLessThanN (int n) {
		
		int i=0;
		
		while(i<n) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		return;
	}

}
