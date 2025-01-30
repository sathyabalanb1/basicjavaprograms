package basicjavaprogams;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isEvenNumber(18);
		System.out.println(ans);
		
		ans=isEvenNumber(9);
		System.out.println(ans);
		
		ans=isEvenNumber(0);
		System.out.println(ans);
		
		System.out.println("-------");
		
		ans=isOddNumber(7);
		System.out.println(ans);
		
		ans=isOddNumber(8);
		System.out.println(ans);
		
		ans=isOddNumber(0);
		System.out.println(ans);

	}
	
	public static boolean isEvenNumber (int n) {
		
		return n%2==0;
	}
	
	public static boolean isOddNumber (int n) {
		return n%2!=0;
	}

}
