package basicjavaprogams;

public class Printalphabetscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "programming";
		
		String b = "abcdefghijklmnopqrstuvwxyz";
		
		String c ="";
		
		String d = "z";
		
		printAlphabetsCount(a);
		System.out.println("---------------");
		
		printAlphabetsCount(b);
		System.out.println("---------------");
		
		printAlphabetsCount(c);
		System.out.println("---------------");
		
		printAlphabetsCount(d);
		System.out.println("---------------");

	}
	
	public static void printAlphabetsCount (String s1) {
		
		int i=0,j=0,temp=0,index;
		
		char c,d;
		
		if(s1 == null || s1.length()==0) {
			System.out.println("The given String is null");
			return;
		}
		int count[] = new int[26];
		
		char ch[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		while(i<s1.length()) {
			
			c=s1.charAt(i);
			
			count[c-97]++;
			
			i++;
		}
		
		while(j<count.length) {
			
			System.out.println(ch[j]+":"+count[j]);
			j++;
		}
		
		return;
		
	}

}
