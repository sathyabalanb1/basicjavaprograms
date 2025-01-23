package basicjavaprogams;

public class Tolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans = toLowercase("SATHYABALAN");
		System.out.println(ans);
		
		ans = toLowercase("reshma");
		System.out.println(ans);
		
		ans = toLowercase("BavithrA");
		System.out.println(ans);

	}
	
	public static String toLowercase (String s1) {
		
		int i=0;
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			sb.append(toLower(c));
			i++;
		}
		
		return sb.toString();
	}
	
	public static char toLower (char c) {
		
		if(c>='a' && c<='z') {
			return c;
		}else {
			return (char) (c+32);
		}
	}

}
