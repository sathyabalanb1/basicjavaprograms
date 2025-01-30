package basicjavaprogams;

public class Primenumberversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isPrimeNumber(2);
		System.out.println(ans);
		
		ans=isPrimeNumber(3);
		System.out.println(ans);
		
		ans=isPrimeNumber(11);
		System.out.println(ans);
		
		ans=isPrimeNumber(17);
		System.out.println(ans);
		
		ans=isPrimeNumber(109);
		System.out.println(ans);
		
		ans=isPrimeNumber(55);
		System.out.println(ans);
		
		ans=isPrimeNumber(0);
		System.out.println(ans);
		
		ans=isPrimeNumber(1);
		System.out.println(ans);
		

	}
	
	public static boolean isPrimeNumber (int n) {
		int i=2;
		
		if(n==0 || n==1) {
			return false;
		}
		
		while(i*i<=n) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
