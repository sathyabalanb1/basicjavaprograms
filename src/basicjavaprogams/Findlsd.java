package basicjavaprogams;

public class Findlsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=findLsd(676);
		System.out.println(ans);
		
		ans=findLsd(8);
		System.out.println(ans);
		
		ans=findLsd(13);
		System.out.println(ans);

	}
	
	public static int findLsd (int n) {
		
		int lsd;
		
		lsd = n%10;
		
		return lsd;
	}

}
