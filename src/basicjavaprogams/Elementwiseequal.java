package basicjavaprogams;

public class Elementwiseequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,10,15,20,25,30,35};
		int b[] = {5,10,15,20,25,30,35};
		
		int c[] = {1,2,3,4};
		int d[] = {1,2};
		
		int e[] = {1,2,3,4,5};
		int f[] = {1,2,3,4,6};
		
		boolean ans;
		ans = elementWiseEqual(a,b);
		System.out.println(ans);
		
		ans = elementWiseEqual(c,d);
		System.out.println(ans);
		
		ans = elementWiseEqual(e,f);
		System.out.println(ans);

	}
	
	public static boolean elementWiseEqual (int x[], int y[]) {
		
		int i=0;
		
		if(x.length != y.length) {
			return false;
		}
		
		while(i<x.length) {
			
			if(x[i] != y[i]) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
