package basicjavaprogams;

public class Removecharrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans = removeCharacterRecursion("hello world",'l');
		System.out.println(ans);
		
		ans = removeCharacterRecursion("abcdefghijkl",'x');
		System.out.println(ans);
		
		ans = removeCharacterRecursion("",'c');
		System.out.println(ans);
		
		ans = removeCharacterRecursion("b",'b');
		System.out.println(ans);


	}
	
	public static String removeCharacterRecursion (String s, char ch) {
		
		if(s == null || s.isEmpty()) {
			return s;
		}
		
		if(ch == s.charAt(0)) {
			return removeCharacterRecursion(s.substring(1),ch);
		}
		
		return s.charAt(0)+removeCharacterRecursion(s.substring(1),ch);
	}

}
