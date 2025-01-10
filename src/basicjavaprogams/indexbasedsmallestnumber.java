package basicjavaprogams;

public class indexbasedsmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,9,4};
		
		int ans;
		ans=indexBasedSmallestNumber(a,5);
		System.out.println(ans);

	}
	
	public static int indexBasedSmallestNumber(int x[],int n) {
		
		if(n<=0 || n>x.length) {
			
			return -1;
		}
		
		selectionsort.selectionSort(x);
		
		return x[n-1];
		
	}

}
