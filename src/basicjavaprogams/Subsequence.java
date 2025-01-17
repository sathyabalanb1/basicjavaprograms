package basicjavaprogams;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans = isSubSequenceExist("sathyabalan","aybla");
		System.out.println(ans);
		
		ans = isSubSequenceExist("abcdefghij","xyz");
		System.out.println(ans);
		
		ans = isSubSequenceExist("lkjpqjmncjkd","jjj");
		System.out.println(ans);
		
		ans = isSubSequenceExist("abcde","aec");
		System.out.println(ans);
		
		ans = isSubSequenceExist("","abc");
		System.out.println(ans);
		
		ans = isSubSequenceExist("abc","");
		System.out.println(ans);
		
		ans = isSubSequenceExist("","");
		System.out.println(ans);

	}
	
	public static boolean isSubSequenceExist (String s1, String seq) {
		
		int i=0,j=0,count=0;
		
		char c,d;
		
		if(s1.isEmpty() && seq.isEmpty()) {
			return true;
		}else if(!s1.isEmpty() && seq.isEmpty()) {
			return true;
		}else if(s1.isEmpty() && !seq.isEmpty()) {
			return false;
		}
		
		while(i<seq.length()) {
			c=seq.charAt(i);
			while(j<s1.length()) {
				d=s1.charAt(j);
				
				if(c==d) {
					count++;
					j++;
					break;
				}else {
					j++;
				}
			}
			if(count==0) {
				return false;
			}
			count=0;
			i++;
		}
		
		return true;		
		
	}

}
