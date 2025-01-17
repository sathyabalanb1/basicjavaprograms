package basicjavaprogams;

public class Removecharwithoutrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans = removeCharWithoutRecursion("hello world",'l');
		System.out.println(ans);
		
		ans = removeCharWithoutRecursion("",'x');
		System.out.println(ans);
		
		ans = removeCharWithoutRecursion("abcdefghijkl",'x');
		System.out.println(ans);
		
		ans = removeCharWithoutRecursion("b",'b');
		System.out.println(ans);

	}
	
	public static String removeCharWithoutRecursion (String s,char ch) {
		
		int i=0;
		
		char c;
		
		StringBuilder sb = new StringBuilder(s);
		
		while(i<sb.length()) {
			c=sb.charAt(i);
			if(c==ch) {
				sb.deleteCharAt(i);
			}else {
				i++;
			}
		}
		
		return sb.toString();
	}

}
