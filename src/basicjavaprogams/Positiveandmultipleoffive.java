package basicjavaprogams;

public class Positiveandmultipleoffive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isPositiveOddAndMultipleOfFive(15);
		System.out.println(ans);
		
		ans=isPositiveOddAndMultipleOfFive(20);
		System.out.println(ans);

	}
	
	public static boolean isPositiveOddAndMultipleOfFive (int n) {
		
		if(n%2 !=0 && n%5==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
