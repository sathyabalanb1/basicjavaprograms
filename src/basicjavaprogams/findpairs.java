package basicjavaprogams;

public class findpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15,7,2,4,9,0,8,5,40,26,3};
		
		findPairs(a,7);

	}
	
	public static void findPairs (int x[], int n) {
		
		int i=0,j;
		
		while(i<x.length) {
			
			j=i+1;
			
			while(j<x.length) {
				
				if(n == x[i]+x[j]) {
					
					System.out.println(x[i]+","+x[j]);
				}
				j++;
			}
			i++;
		}
		
		return;
	}

}
