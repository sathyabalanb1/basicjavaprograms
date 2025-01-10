package basicjavaprogams;

public class linearsearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,5,9,16,8,25,32,4,18};
		
		boolean ans;
		ans = linearSearch(a,40);
		System.out.println(ans);
		
		ans = linearSearch(a,8);
		System.out.println(ans);
		
		
	}
	
	public static boolean linearSearch(int x[], int n) {
		
		int i=0;
		
		while(i<x.length) {
			
			if(n == x[i]) {
				
				return true;
			}
			i++;
		}
		
		return false;
	}

}
