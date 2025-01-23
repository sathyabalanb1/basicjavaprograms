package basicjavaprogams;

public class Stringcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans = stringCopy("sathya");
		System.out.println(ans);

	}
	
	public static String stringCopy (String s1) {
		
		int i=0;
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			sb.append(c);
			i++;
		}
		
		return sb.toString();
	}

}
