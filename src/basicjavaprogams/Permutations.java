package basicjavaprogams;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Permutations of "+"xyz");

		permutations("xyz","");
		
		System.out.println("-----------");
		
		System.out.println("Permutations of "+"abc");
		permutations("abc","");

	}
	
	public static void permutations (String s1, String prefix) {
		int i=0;
		
		String remaining;
		
		if(s1.length()==0) {
			System.out.println(prefix);
			return;
		}
		
		while(i<s1.length()) {
			
			remaining=s1.substring(0, i)+s1.substring(i+1);
			permutations(remaining,prefix+s1.charAt(i));
			i++;
		}
		
		return;
	}

}
