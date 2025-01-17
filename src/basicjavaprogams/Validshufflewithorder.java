package basicjavaprogams;

public class Validshufflewithorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans = isValidShuffle("abc","def","adbcef");
		System.out.println(ans);
		
		ans = isValidShuffle("abc","def","acbedf");
		System.out.println(ans);
		
		ans = isValidShuffle("abc","def","abdecf");
		System.out.println(ans);
		
		ans = isValidShuffle("","def","def");
		System.out.println(ans);
		
		ans = isValidShuffle("DEF","def","defDEH");
		System.out.println(ans);
		
		ans = isValidShuffle("DEF","DEf","DEFDEF");
		System.out.println(ans);

	}
	
	public static boolean isValidShuffle(String s1, String s2, String s3) {
		
		int i=0,j=0,k=0;
		
		if(s1.length()+s2.length() != s3.length()) {
			return false;
		}
		
		while(k<s3.length()) {
			
			if(i<s1.length() && s1.charAt(i) == s3.charAt(k)) {
				i++;
			}else if(j<s2.length() && s2.charAt(j) == s3.charAt(k)) {
				j++;
			}else {
				return false;
			}
			k++;
		}
		
		return i==s1.length() && j==s2.length();
	}

}
