package basicjavaprogams;

public class Reversestringrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "sathyabalan";
		
		String b = "";
		
		String c = "ba";
		
		String ans;
		ans=reverseString(a);
		System.out.println(ans);
		
		ans=reverseString(b);
		System.out.println(ans);
		
		ans=reverseString(c);
		System.out.println(ans);

	}
	
	public static String reverseString (String s1) {
		
		if(s1 == null || s1.length() <=1) {
			return s1;
		}
		char c;
		
		int i=0,j=s1.length()-1;
		
		c = s1.charAt(j);
		
		return c + reverseString(s1.substring(i, j));
	}

}
