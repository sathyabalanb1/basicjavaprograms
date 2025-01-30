package basicjavaprogams;

public class Countnumberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=countNumberOfDigits(18629);
		System.out.println(ans);
		
		ans=countNumberOfDigits(8);
		System.out.println(ans);
		
		ans=countNumberOfDigits(1234567890);
		System.out.println(ans);

	}
	
	public static int countNumberOfDigits (int n) {
		
		int num=n,count=0;
		
		if(n>=0 && n<=9) {
			return 1;
		}
		
		while(num !=0) {
			count++;
			num=num/10;
		}
		
		return count;
	}

}
