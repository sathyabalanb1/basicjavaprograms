package basicjavaprogams;

public class indexbasedlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {33,76,17,42,28,93,11,55};
		
		int ans;
		ans = indexBasedLargestNumber(a,3);
		System.out.println(ans);
		

	}
	
	public static int indexBasedLargestNumber (int x[],int k) {
		
		if(k<=0 || k>x.length) {
			return -1;
		}
		
		reversesort.reverseSort(x);
		
		return x[k-1];
	}

}
