package basicjavaprogams;

public class Finddifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=findDifference(4,6);
		System.out.println(ans);
		
		ans=findDifference(5,2);
		System.out.println(ans);

	}
	
	public static int findDifference (int a, int b) {
		
		int diff;
		
		if(a>b) {
			diff=a-b;
		}else {
			diff=b-a;
		}
		
		return diff;
	}

}
