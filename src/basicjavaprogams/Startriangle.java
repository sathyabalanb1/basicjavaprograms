package basicjavaprogams;

public class Startriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		starTriangle(4);
		
		System.out.println();
		
		starTriangle(8);

	}
	
	public static void starTriangle (int n) {
		
		int i=0,num=n,j,k;
		
		while(i<n) {
			j=num;
			while(j>1) {
				System.out.print(" ");
				j--;
			}
			k=0;
			while(k<=i) {
				System.out.print("*"+" ");
				k++;
			}
			i++;
			num--;
			System.out.println();
		}
		
		return;
	}

}
