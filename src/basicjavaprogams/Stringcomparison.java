package basicjavaprogams;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=stringComparison("bala","balan");
		System.out.println(ans);

	}
	
	public static int stringComparison (String s1, String s2) {
		
		int i=0,j=0;
		
		char c,d;
		
		if(s1==null && s2==null) {
			return 0;
		}
		
		if(s1==null) {
			return 1;
		}
		
		if(s2==null) {
			return -1;
		}
		
		if(s1.length()<s2.length()) {
			
			while(i<s1.length()) {
				c=s1.charAt(i);
				d=s2.charAt(j);
				if(c==d) {
					i++;
					j++;
				}else if(c>d) {
					return -1;
				}else {
					return 1;
				}
			}
		}else {
			
			while(j<s2.length()) {
				c=s1.charAt(j);
				d=s2.charAt(j);
				
				if(c==d) {
					j++;
				}else if(c>d) {
					return -1;
				}else {
					return 1;
				}
			}
		}
		
		if(s1.length()==s2.length()) {
			return 0;
		}else if(s1.length()>s2.length()) {
			return -1;
		}else {
			return 1;
		}
	}

}
