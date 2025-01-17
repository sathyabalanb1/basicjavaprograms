package basicjavaprogams;

public class Countoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcedlkkkkmopmmmxzef";
		
		String b = "123456789";
		
		countOccurrence(a,'e');
		
		countOccurrence(b,'e');
	}
	
	public static void countOccurrence (String s1, char ch) {
		
		int i=0,count=0;
		char c;
		
		while(i<s1.length()) {
			c = s1.charAt(i);
			if(ch == c) {
				count++;
			}
			i++;
		}
		
		System.out.println(count);
		return;
		
	}

}
