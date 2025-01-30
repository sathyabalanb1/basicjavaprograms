package basicjavaprogams;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isLeapYear(1700);
		System.out.println(ans);

	}
	
	public static boolean isLeapYear (int n) {
		
		return (n%4==0 || n%400==0) && (n%100!=0);
	}

}
