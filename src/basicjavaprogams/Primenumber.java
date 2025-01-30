package basicjavaprogams;

public class Primenumber {

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
		
		int i=2,divorscount=0;
		
		if(n==0 || n==1) {
			return false;
		}
		
		while(i<n/2) {
			if(n%i==0) {
				divorscount++;
			}
			i++;
		}
		
		if(divorscount>0) {
			return false;
		}else {
			return true;
		}
	}

}
