package basicjavaprogams;

public class Strongpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isStrongPassword("Reshmasathya@50");
		System.out.println(ans);
		
		ans=isStrongPassword("Sathyabalan");
		System.out.println(ans);
		
		ans=isStrongPassword("bala123");
		System.out.println(ans);
		
		ans=isStrongPassword("Bala1234");
		System.out.println(ans);
		
		ans=isStrongPassword("Bal12#");
		System.out.println(ans);

	}
	
	public static boolean isStrongPassword (String s1) {
		
		int i=0;
		char c;
		
		boolean upper=false,lower=false,numeral=false,punc=false;
		
		if(s1.length()<8) {
			return false;
		}
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			if(c>='a' && c<='z') {
				lower=true;
			}else if(c>='A' && c<='Z') {
				upper=true;
			}else if(c>='0' && c<='9') {
				numeral=true;
			}else if(isPunctuation(c)) {
				punc=true;
			}
			i++;
		}
		
		return upper && lower && numeral && punc;
	}
	
	public static boolean isPunctuation (char c) {
		
		if(!isAlphabet(c) && !isNumeral(c)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean isAlphabet(char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else if(c>='A' && c<='Z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isNumeral (char c) {
		
		if(c>='0' && c<='9') {
			return true;
		}else {
			return false;
		}
	}

}
