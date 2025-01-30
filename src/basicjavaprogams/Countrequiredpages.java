package basicjavaprogams;

public class Countrequiredpages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=countRequiredPages(34);
		System.out.println(ans);
		
		ans=countRequiredPages(27);
		System.out.println(ans);
		
		ans=countRequiredPages(27);
		System.out.println(ans);
		
		ans=countRequiredPages(40);
		System.out.println(ans);
		
		ans=countRequiredPages(5);
		System.out.println(ans);

	}
	
	public static int countRequiredPages (int items) {
		
		return (items+9)/10;
	}

}
