package basicjavaprogams;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "silent";
		
		String s3 = "Listen";
		String s4 = "silenT";
		
		String s5 = "a gentleman";
		String s6 = "elegant man";
		
		String s7 = "";
		String s8 = "sathya";
		
		String s9 = "";
		String s10 = "";
		
		String s11 = "dormitory!";
		String s12 = "dirty room!";
		
		String s13 = "!";
		String s14 = "!";
		
		boolean ans;
		ans = isAnagrams(s1,s2);
		System.out.println(ans);
		
		ans = isAnagrams(s3,s4);
		System.out.println(ans); 
		
		ans = isAnagrams(s5,s6);
		System.out.println(ans);
		
		ans = isAnagrams(s7,s8);
		System.out.println(ans);
		
		ans = isAnagrams(s9,s10);
		System.out.println(ans);
		
		ans = isAnagrams(s11,s12);
		System.out.println(ans);
		
		ans = isAnagrams(s13,s14);
		System.out.println(ans);

	}
	
	public static String removePunctuations(String s1) {
		
		int i=0;
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<s1.length()) {
			
			c = s1.charAt(i);
			
			if(c>='a' && c<='z') {
				sb.append(c);
			}else if(c>='A' && c<='Z') {
				sb.append(c);
			}
			
			i++;
			
		}
		
		return sb.toString();
	}
	
	public static boolean elementWiseEqual (int a1[], int a2[]) {
		
		int i=0;
		
		if(a1.length != a2.length) {
			return false;
		}
		
		while(i<a1.length) {
			
			if(a1[i] != a2[i]) {
				return false;
			}
			i++;
		}
		
		return true;
	}
	
	public static boolean isAnagrams (String s1, String s2) {
		
		int i=0,j=0;
		
		char c,d;
		
		boolean result;
		
		String input1 = removePunctuations(s1);
		String input2= removePunctuations(s2);
		
		if(input1.length() != input2.length() || input1.length() == 0 || input2.length() == 0) {
			return false;
		}
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		int count[] = new int[26];
		int sum[] = new int[26];
		
		while(i<input1.length()) {
			
			c=input1.charAt(i);
			count[c-97]++;
			i++;
		}
		
		while(j<input2.length()) {
			d=input2.charAt(j);
			sum[d-97]++;
			j++;
		}
		
		result = elementWiseEqual(count,sum);
		
		return result;
	}

}
