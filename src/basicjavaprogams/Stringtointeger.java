package basicjavaprogams;

public class Stringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans = stringToInteger("1405");
		System.out.println(ans);
		
		ans = stringToInteger("67263");
		System.out.println(ans);
		
		ans = stringToInteger("1");
		System.out.println(ans);

	}
	
	public static int stringToInteger (String s1) {
		
		int i=0,sum=0;
		char c;
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			sum = sum*10+c-48;
			i++;
		}
		
		return sum;
	}

}
