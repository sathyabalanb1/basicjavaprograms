package basicjavaprogams;

import java.util.ArrayList;
import java.util.List;

public class Splitwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>ans;
		ans = splitWords("Java is best programming language");
		printList(ans);
		
		ans = splitWords("!@#$%^&*()");
		printList(ans);
		
		ans = splitWords("      he is       a");
		printList(ans);
		

	}
	
	public static List<String> splitWords (String s1){
		
		int i=0,j=0,k=0,l=0,start=0,end=0,wordcount=0,temp=0;
		
		char c,d,e,ch;
		
		List<String>wordslist = new ArrayList<>();
		
		String word;
		
		while(i<s1.length()-1) {
			
			j=i;
			while(j<s1.length()) {				
				c = s1.charAt(j);				
				if(isAlphabet(c)) {
					start=j;
					temp++;
					break;
				}else {
					j++;
				}
				
			}
			
			if(wordcount == 0 && temp==0) {
				return wordslist;
			}
			k=j;
			
			while(k<s1.length()-1) {
				l=k+1;
				d=s1.charAt(k);
				e=s1.charAt(l);
				
				if(isAlphabet(d) && !isAlphabet(e)) {
					end=k;
					wordcount++;
					word = pickWord(start,end,s1);
					wordslist.add(word);
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
				end=k;
				word = pickWord(start,end,s1);
				wordslist.add(word);
			}
		}
		
		return wordslist;
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
	
	public static String pickWord (int start,int end,String s1) {
		
		int i=start;
		
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<=end) {
			c = s1.charAt(i);
			sb.append(c);
			i++;
		}
		
		return sb.toString();
	}
	
	public static void printList(List<String>input) {
		int i=0;
		
		while(i<input.size()) {
			System.out.println(input.get(i));
			i++;
		}
		return;
	}

}
