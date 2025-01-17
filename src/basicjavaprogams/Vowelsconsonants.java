package basicjavaprogams;

public class Vowelsconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aeiouAEIOU";
		
		String b = "abcdexyzi";
		
		String c = "12345)(*&65$";
		
		String d = "#$i(*&^U";
		
		countVowelsConsonants(a);
		
		System.out.println("----");
		
		countVowelsConsonants(b);
		
		System.out.println("----");
		
		countVowelsConsonants(c);
		
		System.out.println("----");
		
		countVowelsConsonants(d);

	}
	
	public static void countVowelsConsonants (String s1) {
		
		int i=0,vowelscount=0,consonantscount=0;
		
		char c;
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			if(isVowel(c)) {
				vowelscount++;
			}else if(isConsonant(c)) {
				consonantscount++;
			}
			i++;
		}
		
		System.out.println("Number of Vowels: "+vowelscount);
		System.out.println("Number of Consonants: "+consonantscount);
		return;
	}
	
	public static boolean isVowel (char c) {
		
		if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}else if(c == 'A' || c=='E' || c=='I' || c=='O' || c=='U') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isConsonant (char c) {
		
		if(isAlphabet(c)) {
			if(!isVowel(c)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public static boolean isAlphabet (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else if(c>='A' && c<='Z') {
			return true;
		}else {
			return false;
		}
	}

}
