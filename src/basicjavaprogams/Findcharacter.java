package basicjavaprogams;

public class Findcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans = findCharacter("sathyabalan",'z');
		System.out.println(ans);
		
		ans = findCharacter("abcdefghijk",'k');
		System.out.println(ans);
		
		ans = findCharacter("aaaaaaaaaa",'a');
		System.out.println(ans);

	}
	
	public static boolean findCharacter (String s1, char ch) {
		
		int i=0;
		
		char c;
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			if(ch==c) {
				return true;
			}
			i++;
		}
		
		return false;
	}

}
