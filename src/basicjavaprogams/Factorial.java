package basicjavaprogams;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=factorial(5);
		System.out.println(ans);
		
		ans=factorial(0);
		System.out.println(ans);
		
		ans=factorial(1);
		System.out.println(ans);
		
		ans=factorial(7);
		System.out.println(ans);
		
		ans=factorial(6);
		System.out.println(ans);

	}
	
	public static int factorial (int n) {
		
		int i=1,prod=1;
		
		while(i<=n) {
			prod=prod*i;
			i++;
		}
		return prod;
	}

}
