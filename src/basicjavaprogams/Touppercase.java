package basicjavaprogams;

public class Touppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans = toUpperCase("sathyabalan");
		System.out.println(ans);
		
		ans = toUpperCase("ReshmA");
		System.out.println(ans);

	}
	
	public static String toUpperCase (String s1) {
		
		int i=0;
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			sb.append(toUpper(c));
			i++;
		}
		
		return sb.toString();
	}
	
	public static char toUpper (char ch) {
		
		if(ch>='A' && ch<='Z') {
			return ch;
		}else {
			return (char) (ch-32);
		}
	}

}
