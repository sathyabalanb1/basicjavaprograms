package basicjavaprogams;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isPerfectNumber(6);
		System.out.println(ans);
		
		ans=isPerfectNumber(28);
		System.out.println(ans);
		
		ans=isPerfectNumber(1);
		System.out.println(ans);
		
		ans=isPerfectNumber(10);
		System.out.println(ans);
		
		ans=isPerfectNumber(15);
		System.out.println(ans);

	}
	
	public static boolean isPerfectNumber (int n) {
		int num=n,sum=0,i=1;
		
		while(i<=n/2) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		
		if(n==sum) {
			return true;
		}else {
			return false;
		}
	}

}
