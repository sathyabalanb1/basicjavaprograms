package basicjavaprogams;

public class Reverseelementwiseequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b[] = {5,4,3,2,1};
		
		int c[] = {10,11,12};
		int d[] = {9,10,11,12};
		
		int e[] = {21,22,23};
		int f[] = {20,22,23};
		
		boolean ans;
		ans=isReverseElementWiseEqual(a,b);
		System.out.println(ans);
		
		ans=isReverseElementWiseEqual(c,d);
		System.out.println(ans);
		
		ans=isReverseElementWiseEqual(e,f);
		System.out.println(ans);

	}
	
	public static boolean isReverseElementWiseEqual (int x[], int y[]) {
		
		int i=0,j=x.length-1;
		
		if(x.length != y.length) {
			return false;
		}
		
		while(i<x.length) {
			
			if(x[i] != y[j]) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
