package basicjavaprogams;

public class Substringsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=pickSimpleSubstring("A");
		System.out.println(ans);
		

	}
	
	public static String pickSimpleSubstring (String s1) {
		
		return s1.substring(0, 1);
		
	}
	
	

}
