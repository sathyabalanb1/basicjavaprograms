package basicjavaprogams;

public class Doubletriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doubleTriangle(4);
		
		System.out.println("------------");
		
		doubleTriangle(8);

	}
	
	public static void doubleTriangle (int n) {
		
		int i=0,j,k,num=n,temp=n-1;
		
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
			num--;
			i++;
			System.out.println();
			
		}
		
		num=n-1;
		i=0;
		j=0;
		k=0;
		
		while(i<num) {
			j=0;
			while(j<=i) {
				System.out.print(" ");
				j++;
			}
			k=temp;
			while(k>0) {
				System.out.print("*"+" ");
				k--;
			}
			i++;
			temp--;
			System.out.println();
		}
		return;
	}

}
