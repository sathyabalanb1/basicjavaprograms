package basicjavaprogams;

public class Printevennumberstilln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printEvenNumbersTillN(25);

	}
	
	public static void printEvenNumbersTillN (int n) {
		
		int i=0;
		
		while(i<=n) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		return;
	}

}
