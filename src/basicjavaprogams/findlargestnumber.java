package basicjavaprogams;

public class findlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {14,15,9,12,21,7,40,31,51,5,16};
		
		int ans;
		ans = findLargestNumber(a);
		System.out.println(ans);

	}
	
	public static int findLargestNumber(int x[]) {
		
		int i=0,big=x[0];
		
		while(i<x.length) {
			
			if(big<x[i]) {
				
				big=x[i];
			}
			i++;
		}
		
		return big;
	}

}
