package basicjavaprogams;

public class findsmallestnumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {14,15,9,12,21,7,40,31,51,5,16};
		
		int ans;
		ans = findSmallestNumber(a);
		System.out.println(ans);
		
	}
	
	public static int findSmallestNumber(int x[]) {
		
		int i=0,small=x[0];
		
		while(i<x.length) {
			
			if(small>x[i]) {
				small = x[i];
			}
			i++;
		}
		
		return small;
	}

}
