package basicjavaprogams;

public class Absolutevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=pickAbsoluteValue(-8);
		System.out.println(ans);
		
		ans=pickAbsoluteValue(34);
		System.out.println(ans);
		
		ans=pickAbsoluteValue(0);
		System.out.println(ans);


	}
	
	public static int pickAbsoluteValue (int input) {
		
		if(input<0) {
			return input*-1;
		}else {
			return input;
		}
	}

}
