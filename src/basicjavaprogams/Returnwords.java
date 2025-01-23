package basicjavaprogams;

public class Returnwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans = returnWords("  java*&(is best   programming(*76language",4);
		System.out.println(ans);
		
		ans = returnWords("  java*&(is best   programming(*76language",7);
		System.out.println(ans);
		
		ans = returnWords("a b *()c!@#d e f g h",8);
		System.out.println(ans);

	}
	
	public static String returnWords (String s1, int n) {
		
		int i=0,j=0,k=0,l=0,start=0,end=0;
		
		int wordcount=0,temp=0;
		
		char c,d,e,ch;
		
		String word;
		
		while(i<s1.length()-1) {
			
			j=i;
			while(j<s1.length()) {
				c=s1.charAt(j);
				if(isAlphabet(c)) {
					start=j;
					temp++;
					break;
				}
				j++;
			}
			
			if(temp==0 && wordcount==0) {
				return s1;
			}
			
			k=j;
			
			while(k<s1.length()-1) {
				l=k+1;
				d=s1.charAt(k);
				e=s1.charAt(l);
				if(isAlphabet(d) && !isAlphabet(e)) {
					wordcount++;
					end=k;
					if(n==wordcount) {
						word = pickWord(start,end,s1);
						return word;
					}else {
						break;
					}
				}
				k++;
			}
			i=k+1;
			temp=0;
		}
		
		if(k==s1.length()-1) {
			ch=s1.charAt(k);
			if(isAlphabet(ch)) {
				wordcount++;
				end=k;
				if(n==wordcount) {
					word=pickWord(start,end,s1);
					return word;
				}
			}
		}
		
		return s1;
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
	
	public static String pickWord (int start, int end, String s1) {
		
		int i=start;
		char ch;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<=end) {
			ch = s1.charAt(i);
			sb.append(ch);
			i++;
		}
		
		return sb.toString();
		
		
	}

}
