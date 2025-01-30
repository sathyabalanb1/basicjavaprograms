package basicjavaprogams;

public class Printoddnumberstilln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printOddNumbersTillN(25);

	}
	
	public static void printOddNumbersTillN (int n) {
		
		int i=0;
		
		while(i<=n) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		System.out.println();
		return;
	}

}
