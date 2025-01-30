package basicjavaprogams;

public class Findmiddlenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=findMiddleNumber(6,10);
		System.out.println(ans);
		
		ans=findMiddleNumber(5,10);
		System.out.println(ans);

	}
	
	public static int findMiddleNumber (int a, int b) {
		
		int mid;
		
		mid=(a+b)/2;
		
		return mid;
	}

}
