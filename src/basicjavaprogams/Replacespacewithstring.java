package basicjavaprogams;

public class Replacespacewithstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Java is best";
		
		String b = "sathya  loves reshma  ";
		
		String c = "abc!@#$%cdeksksksk)(*&6%";
		
		String d = " ";
		
		String e = "";
		
		String ans;
		ans=replaceSpaceWithString(a);
		System.out.println(ans);
		
		ans=replaceSpaceWithString(b);
		System.out.println(ans);
		
		ans=replaceSpaceWithString(c);
		System.out.println(ans);
		
		ans=replaceSpaceWithString(d);
		System.out.println(ans);
		
		ans=replaceSpaceWithString(e);
		System.out.println(ans);
		
		System.out.println("----");


	}
	
	public static String replaceSpaceWithString (String s1) {
		
		int i=0,j=0;
		
		char c;
		
		if(s1 == null) {
			return s1;
		}
		
		String repl="%20";
		
		StringBuilder sb = new StringBuilder(s1);
		
		while(i<sb.length()) {
			
			c=sb.charAt(i);
			if(c == ' ') {
				sb.replace(i, i+1, repl);
			}
			i++;
		}
		
		return sb.toString();
		
		
	}

}
