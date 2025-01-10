package basicjavaprogams;

public class Removeduplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "sathyabalan";
		
		String b= "w";
		
		String c = "ddddddddddddd";
		
		String d = "";
		
		String e = "abcdefghijklmnopqrstuvwxyz";
		
		String ans;
		ans = removeDuplicateCharacters(a);
		System.out.println(ans);
		
		ans = removeDuplicateCharacters(b);
		System.out.println(ans);
		
		ans = removeDuplicateCharacters(c);
		System.out.println(ans);
		
		ans = removeDuplicateCharacters(d);
		System.out.println(ans);
		
		ans = removeDuplicateCharacters(e);
		System.out.println(ans);

	}
	
	public static String removeDuplicateCharacters (String s1) {
		
		int i=0,j=0;
		
		char c,d;
		
		if(s1 == null || s1.length()==0) {
			return s1;
		}
		
		StringBuilder sb = new StringBuilder(s1);
		
		while(i<sb.length()) {
			j=i+1;
			c = sb.charAt(i);
			while(j<sb.length()) {
				
				d = sb.charAt(j);
				
				if(c == d) {
					sb.deleteCharAt(j);
				}else {
					j++;
				}
			}
			i++;
		}
	//	System.out.println(sb.toString());
		return sb.toString();
	}

}
