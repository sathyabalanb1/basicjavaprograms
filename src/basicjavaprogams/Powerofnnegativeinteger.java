package basicjavaprogams;

public class Powerofnnegativeinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ans;
		ans = power (2,5);
		System.out.println(ans);
		
		ans = power (2,-5);
		System.out.println(ans);

	}
	
	public static double power(double base, int exponent) {
		
		if(exponent<0) {
			return 1/power(base,-exponent);
		}
		
		int i;
		
		double result=1;
		
		for(i=0;i<exponent;i++) {
			
			result*=base;
		}
		
		return result;
	}

}
