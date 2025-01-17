package basicjavaprogams;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "malayalam";
		
		String b = "sathyabalan";
		
		String c = "mm";
		
		String d = "madam";
		
		String e = "radar";
		
		String f = "";
		
		boolean ans;
		ans = isPalindrome(s1);
		System.out.println(ans);
		
		ans = isPalindrome(b);
		System.out.println(ans);
		
		ans = isPalindrome(c);
		System.out.println(ans);
		
		ans = isPalindrome(d);
		System.out.println(ans);
		
		ans = isPalindrome(e);
		System.out.println(ans);
		
		ans = isPalindrome(f);
		System.out.println(ans);


	}
	
	public static boolean isPalindrome (String s1) {
		
		int i=0,j=s1.length()-1;
		
		char c, d;
		
		if(s1.length()==0 || s1==null) {
			return false;
		}
		
		while(i<s1.length() && j>=0) {
			
			c = s1.charAt(i);
			d = s1.charAt(j);
			
			if(c==d) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		
		return true;
	}

}
