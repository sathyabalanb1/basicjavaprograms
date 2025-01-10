package basicjavaprogams;

public class Recurfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=recurFactorial(1);
		System.out.println(ans);
		
		ans=recurFactorial(5);
		System.out.println(ans);
		
		ans=recurFactorial(0);
		System.out.println(ans);
		
		ans=recurFactorial(10);
		System.out.println(ans);

	}
	
	public static int recurFactorial (int n) {
		
		int prod=1;
		
		if(n==0 || n==1) {
			return 1;
		}
		
		prod=n*recurFactorial(n-1);
		return prod;
	}

}
