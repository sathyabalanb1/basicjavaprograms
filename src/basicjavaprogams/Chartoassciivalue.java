package basicjavaprogams;

public class Chartoassciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=charToAssciiValue('1');
		System.out.println(ans);
		
		ans=charToAssciiValue('!');
		System.out.println(ans);
		
		ans=charToAssciiValue('a');
		System.out.println(ans);
		
		ans=charToAssciiValue('A');
		System.out.println(ans);


	}
	
	public static int charToAssciiValue(char c) {
		return (int) c;
	}

}
