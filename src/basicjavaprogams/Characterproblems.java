package basicjavaprogams;

public class Characterproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isLowerCase('A');
		System.out.println(ans);
		
		ans=isLowerCase('*');
		System.out.println(ans);
		
		ans=isLowerCase('d');
		System.out.println(ans);
		
		System.out.println("--------");
		
		ans=isUpperCase('8');
		System.out.println(ans);
		
		ans=isUpperCase('c');
		System.out.println(ans);
		
		ans=isUpperCase('C');
		System.out.println(ans);
		
		System.out.println("----");
		
		ans=isNumeral('8');
		System.out.println(ans);
		
		ans=isNumeral('&');
		System.out.println(ans);
		
		ans=isNumeral('u');
		System.out.println(ans);
		
		System.out.println("--------");
		
		
		ans=isEnglishAlphabet('&');
		System.out.println(ans);
		
		ans=isEnglishAlphabet('3');
		System.out.println(ans);
		
		ans=isEnglishAlphabet('w');
		System.out.println(ans);
		
		ans=isEnglishAlphabet('R');
		System.out.println(ans);
		
		System.out.println("--------");
		
		ans=isAlphaNumeric('*');
		System.out.println(ans);
		
		ans=isAlphaNumeric('9');
		System.out.println(ans);
		
		ans=isAlphaNumeric('a');
		System.out.println(ans);
		
		ans=isAlphaNumeric('I');
		System.out.println(ans);
		
		System.out.println("-----");
		
		ans=isPunctuation('(');
		System.out.println(ans);
		
		ans=isPunctuation('!');
		System.out.println(ans);
		
		ans=isPunctuation('9');
		System.out.println(ans);
		
		ans=isPunctuation('k');
		System.out.println(ans);
		
		System.out.println("-----");
		
		ans=isVowel('R');
		System.out.println(ans);
		
		ans=isVowel('i');
		System.out.println(ans);
		
		ans=isVowel('I');
		System.out.println(ans);
		
		ans=isVowel('p');
		System.out.println(ans);
		
		System.out.println("--------");
		
		ans=isConsonant('E');
		System.out.println(ans);
		
		ans=isConsonant('i');
		System.out.println(ans);
		
		ans=isConsonant('B');
		System.out.println(ans);
		
		ans=isConsonant('&');
		System.out.println(ans);
		
		System.out.println("----------");
		
		char ch;
		ch=toUpper('u');
		System.out.println(ch);
		
		ch=toUpper('K');
		System.out.println(ch);
		
		ch=toUpper('e');
		System.out.println(ch);
		
		System.out.println("-------");
		
		ch=toLower('K');
		System.out.println(ch);
		
		ch=toLower('l');
		System.out.println(ch);
		
		ch=toLower('M');
		System.out.println(ch);
	}
	
	public static boolean isLowerCase (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isUpperCase (char c) {
		
		if(c>='A' && c<='Z') {
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
	
	public static boolean isEnglishAlphabet (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else if(c>='A' && c<='Z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isAlphaNumeric (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else if(c>='A' && c<='Z') {
			return true;
		}else if(c>='0' && c<='9') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPunctuation (char c) {
		
		if(!isAlphaNumeric(c)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isVowel (char c) {
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}else if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isConsonant (char c) {
		
		if(isEnglishAlphabet(c)) {
			
			if(!isVowel(c)) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
	public static char toUpper (char c) {
		
		if(isUpperCase(c)) {
			return c;
		}
		
		return (char) (c-32);
	}
	
	public static char toLower (char c) {
		
		if(isLowerCase(c)) {
			return c;
		}
		
		return (char) (c+32);
	}

}
