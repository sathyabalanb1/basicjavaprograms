package basicjavaprogams;

public class Printnumberstilln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbersTillN(8);
		
		printNumbersTillN(4);

	}
	
	public static void printNumbersTillN (int n) {
		
		int i=0;
		
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		return;
	}

}
