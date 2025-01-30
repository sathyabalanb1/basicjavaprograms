package basicjavaprogams;

public class Assciivaluetocharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ans;
		ans=assciiValueToCharacter(49);
		System.out.println(ans);

	}
	
	public static char assciiValueToCharacter (int input) {
		
		return (char) input;
	}

}
