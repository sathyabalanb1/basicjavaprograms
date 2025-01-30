package basicjavaprogams;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isArmstrongNumber(153);
		System.out.println(ans);
		
		ans=isArmstrongNumber(1);
		System.out.println(ans);
		
		ans=isArmstrongNumber(0);
		System.out.println(ans);
		
		ans=isArmstrongNumber(1634);
		System.out.println(ans);
		
		ans=isArmstrongNumber(9474);
		System.out.println(ans);
		
		ans=isArmstrongNumber(54748);
		System.out.println(ans);
		
		ans=isArmstrongNumber(10);
		System.out.println(ans);
		
		ans=isArmstrongNumber(123);
		System.out.println(ans);
		
		ans=isArmstrongNumber(100);
		System.out.println(ans);
		
		ans=isArmstrongNumber(9475);
		System.out.println(ans);

	}
	
	public static boolean isArmstrongNumber (int n) {
		int num=n,sum=0,val,count=0;
		
		count = pickDigits(n);
		
		
		while(num!=0) {
			val=num%10;
			sum=sum+calculatePower(val,count);
			num=num/10;
		}
		
		if(n==sum) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int calculatePower (int n, int power) {
		
		int i=1,val=1;
		
		while(i<=power) {
			val=val*n;
			i++;
		}
		
		return val;
	}
	
	public static int pickDigits (int n) {
		int num=n,totaldigits=0;
		
		if(num == 0) {
			return 1;
		}
		
		while(num != 0) {
			totaldigits++;
			num=num/10;
		}
		
		return totaldigits;
		
	}

}
