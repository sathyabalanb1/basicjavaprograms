package basicjavaprogams;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=countWords("He is       a");
		System.out.println(ans);
		
		ans=countWords("Java is best programming language             ");
		System.out.println(ans);
		
		ans=countWords("       sathya*&^%$loves$%^*vishali    reddy");
		System.out.println(ans);
		
		ans=countWords("!@#$%^&*()");
		System.out.println(ans);

	}
	
	public static int countWords (String s1) {
		
		int i=0,j=0,k=0,l=0,wordcount=0,temp=0,start=0,end=0;
		
		char c,d,e,ch;
		
		while(i<s1.length()-1) {
			j=i;
			while(j<s1.length()) {
				c=s1.charAt(j);
				if(isAlphabet(c)) {
					temp++;
					break;
				}
				j++;
			}
			
			if(temp==0 && wordcount==0) {
				return temp;
			}
			start=j;
			k=j;
			
			while(k<s1.length()-1) {
				
				l=k+1;
				d=s1.charAt(k);
				e=s1.charAt(l);
				if(isAlphabet(d) && !isAlphabet(e)) {
					wordcount++;
					break;
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
			}
		}
		
		return wordcount;
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
