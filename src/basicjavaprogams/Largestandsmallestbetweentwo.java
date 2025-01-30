package basicjavaprogams;

public class Largestandsmallestbetweentwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=largestBetweenTwo(5,6);
		System.out.println(ans);
		
		ans=largestBetweenTwo(8,5);
		System.out.println(ans);
		
		ans=largestBetweenTwo(7,7);
		System.out.println(ans);
		
		System.out.println("---------");
		
		ans = smallestBetweenTwo(4,3);
		System.out.println(ans);
		
		ans = smallestBetweenTwo(9,12);
		System.out.println(ans);
		
		ans = smallestBetweenTwo(5,5);
		System.out.println(ans);

	}
	
	public static int largestBetweenTwo (int a, int b) {
		
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int smallestBetweenTwo (int a, int b) {
		
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}

}
