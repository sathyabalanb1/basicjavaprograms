package basicjavaprogams;

public class Stringconcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=stringConcatenation("sathya","balan");
		System.out.println(ans);

	}
	
	public static String stringConcatenation (String s1, String s2) {
		
		int i=0,j=0;
		
		char c,d;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			sb.append(c);
			i++;
		}
		
		while(j<s2.length()) {
			d=s2.charAt(j);
			sb.append(d);
			j++;
		}
		
		return sb.toString();
	}

}
