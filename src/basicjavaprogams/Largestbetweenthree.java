package basicjavaprogams;

public class Largestbetweenthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=largestBetweenThree(3,5,6);
		System.out.println(ans);
		
		ans=largestBetweenThree(4,7,3);
		System.out.println(ans);
		
		ans=largestBetweenThree(8,7,6);
		System.out.println(ans);

	}
	
	public static int largestBetweenThree (int a, int b, int c) {
		int big=a;
		
		if(big<b) {
			big=b;
		}
		
		if(big<c) {
			big=c;
		}
		
		return big;
	}

}
