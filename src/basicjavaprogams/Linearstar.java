package basicjavaprogams;

public class Linearstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linearStar(4);
		
		System.out.println();
		
		linearStar(8);

	}
	
	public static void linearStar (int n) {
		
		int i=0,j=0;
		
		while(i<n) {
			j=0;
			while(j<=i) {
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		return;
	}

}
