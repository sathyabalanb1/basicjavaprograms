package basicjavaprogams;

public class Reversestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseStar(5);
		
		System.out.println();
		
		reverseStar(8);

	}
	
	public static void reverseStar (int n) {
		
		int i=n,j;
		
		while(i>=1) {
			j=i;
			while(j>=1) {
				System.out.print("*"+" ");
				j--;
			}
			System.out.println();
			i--;
		}
		
		return;
	}

}
