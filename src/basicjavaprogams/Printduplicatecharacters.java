package basicjavaprogams;

public class Printduplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "java";
		
		String b = "";
		
		String c = "abcdefgh";
		
		String d = "bbbdcfkklmnnnbxyzykb";
		
		printDuplicateCharacters(a);
		
		printDuplicateCharacters(b);
		
		printDuplicateCharacters(c);
		
		printDuplicateCharacters(d);
	}
	
	public static void printDuplicateCharacters (String s1) {
		
		int i=0,j=0,temp=0;
		char c;
		
		char ch[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int count[] = new int[26];
		
		if(s1.length() == 0) {
			System.out.println("The given string is null");
			return;
		}
		
		while(i<s1.length()) {
			c= s1.charAt(i);
			count[c-97]++;
			i++;
		}
		
		while(j<ch.length) {
			if(count[j]>1) {
				temp++;
				System.out.println(ch[j]+":"+count[j]);
			}
			j++;
		}
		
		if(temp==0) {
			System.out.println("There is no duplicate characters in the given string");
		}
		
		return;
	}

}
