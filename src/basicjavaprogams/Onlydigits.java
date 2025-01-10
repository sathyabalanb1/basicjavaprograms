package basicjavaprogams;

public class Onlydigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ksksksksksk";
		
		String b = "123456789";
		
		String c = "12a42";
		
		boolean ans;
		ans=onlyDigits(a);
		System.out.println(ans);
		
		ans=onlyDigits(b);
		System.out.println(ans);
		
		ans=onlyDigits(c);
		System.out.println(ans);

	}
	
	public static boolean onlyDigits (String s1) {
		
		int i=0;
		char c;
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			
			if(c>='0' && c<='9') {
				i++;
			}else {
				return false;
			}
		}
		
		return true;
	}

}
