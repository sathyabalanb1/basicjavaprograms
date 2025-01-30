package basicjavaprogams;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=reverseNumber(18629);
		System.out.println(ans);

		ans=reverseNumber(1405);
		System.out.println(ans);
		
		ans=reverseNumber(8);
		System.out.println(ans);
	}
	
	public static int reverseNumber (int n) {
		
		int num=n,rn=0,dig;
		
		if(n>=0 && n<=9) {
			return n;
		}
		
		while(num!=0) {
			dig=num%10;
			rn=rn*10+dig;
			num=num/10;
		}
		
		return rn;
	}

}
