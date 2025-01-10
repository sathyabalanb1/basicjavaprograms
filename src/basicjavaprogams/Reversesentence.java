package basicjavaprogams;

import java.util.ArrayList;
import java.util.List;

public class Reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Java is best programming language";
		
		String b = "    sathya loves    reshma      ";
		
		String c = "sathya         ";
		
		String d = "";
		
		String e = "a b c";
		
		String f = "z";
		
		String g ="848494040#$5^&*()!";
		
		String ans;
		ans = reverseSentence(a);
		System.out.println(ans);
		
		ans = reverseSentence(b);
		System.out.println(ans);
		
		ans = reverseSentence(c);
		System.out.println(ans);
		
		ans = reverseSentence(d);
		System.out.println(ans); 
		
		ans = reverseSentence(e);
		System.out.println(ans);
		
		ans = reverseSentence(f);
		System.out.println(ans);
		
		ans = reverseSentence(g);
		System.out.println(ans);
	}
	
	public static String reverseSentence (String s1) {
		
		int i=0,j=0,k=0,l=0,temp=0,wordcount=0,start=0,end=0;
		
		char c, d, e, ch;
		
		String result,output;
		
		List<String> wordslist = new ArrayList<>();
		
		if(s1 == null || s1.length()==0) {
			return s1;
		}
		
		while(i<s1.length()-1) {
			j=i;
			while(j<s1.length()) {
				c = s1.charAt(j);
				if(isAlphabet(c)) {
					temp++;
					start=j;
					break;
				}
				j++;
			}
			
			if(temp == 0 && wordcount == 0) {
				return s1;
			}
			
			k=j;
			
			while(k<s1.length()-1) {
				
				l=k+1;
				
				d=s1.charAt(k);
				e=s1.charAt(l);
				
				if(isAlphabet(d) && !isAlphabet(e)) {
					wordcount++;
					end = k;
					result = pickWord(start,end,s1);
					wordslist.add(result);
					break;
				}
				k++;
			}
			if(k==s1.length()-1) {
				i=k;
			}else {
				i=k+1;
			}
			temp=0;
		}
		if(i==s1.length()-1) {
			ch = s1.charAt(i);
			if(isAlphabet(ch)) {
				end=i;
				result = pickWord(start,end,s1);
				wordslist.add(result);
			}
		}
		
		output = reverseWords(wordslist);
		return output;
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
	
	public static String pickWord(int start,int end,String input) {
		
		int i=start;
		
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<=end) {
			c = input.charAt(i);
			sb.append(c);
			i++;
		}
		
		return sb.toString();
	}
	
	public static String reverseWords(List<String>list) {
		
		int i=list.size()-1;
		
		StringBuilder sb = new StringBuilder();
		
		while(i>=0) {
			list.get(i);
			sb.append(list.get(i));
			sb.append(" ");
			i--;
		}
		
		return sb.toString();
	}
	
	

}
