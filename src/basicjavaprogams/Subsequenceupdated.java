package basicjavaprogams;

public class Subsequenceupdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=subSequence("sathyabalan","aybla");
		System.out.println(ans);
		
		ans=subSequence("abcdefghi","xyz");
		System.out.println(ans);
		
		ans=subSequence("abc","abcd");
		System.out.println(ans);
		
		ans=subSequence("akhjbn","hjB");
		System.out.println(ans);
		
		ans=subSequence("opqrpqmpqv","pqv");
		System.out.println(ans);

	}
	
	public static boolean subSequence (String input, String seq) {
		
		int i=0,j=0,count=0;
		
		char c,d;
		
		if(input.length()<seq.length()) {
			return false;
		}
		
		while(i<seq.length()) {
			c=seq.charAt(i);
			while(j<input.length()) {
				d=input.charAt(j);
				if(c==d) {
					j++;
					count++;
					break;
				}else {
					j++;
				}
			}
			if(count==0) {
				return false;
			}
			i++;
			count=0;
		}
		
		return true;
	}

}
