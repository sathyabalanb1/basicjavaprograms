package basicjavaprogams;

public class Largestodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,8,28,9,13,34,11,15,60};
		
		int ans;
		ans = largestOdd(a);
		System.out.println(ans);

	}
	
	public static int largestOdd (int x[]) {
		
		int i=0,largestodd=-1;
		
		while(i<x.length) {
			
			if(x[i]%2 !=0) {
				
				if(largestodd < x[i]) {
					largestodd = x[i];
				}
			}
			i++;
		}
		
		return largestodd;
	}

}
