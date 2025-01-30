package basicjavaprogams;

public class Pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pascalTriangle(4);
		
		System.out.println("----------");
		
		pascalTriangle(6);

	}
	
	public static void pascalTriangle (int n) {
		
		int i=0,j=0,k=0,num=n,binom=1;
		
		while(i<n) {
			j=num;
			while(j>1) {
				System.out.print(" ");
				j--;
			}
			k=0;
			while(k<=i) {
				if(i==0 || k==0) {
					System.out.print(binom+" ");
				}else {
					binom=(binom*(i-k+1))/k;
					System.out.print(binom+" ");
				}
				k++;
			}
			i++;
			num--;
			System.out.println();
		}
	}

}
