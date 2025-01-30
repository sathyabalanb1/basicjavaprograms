package basicjavaprogams;

public class Roundoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=roundOff(2.3);
		System.out.println(ans);
		
		ans=roundOff(3.6);
		System.out.println(ans);
		
		ans=roundOff(14.1);
		System.out.println(ans);

	}
	
	public static int roundOff (double f) {
		
		return (int) (f+0.5);
	}

}
