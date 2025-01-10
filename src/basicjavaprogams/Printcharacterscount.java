package basicjavaprogams;

public class Printcharacterscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "programming";
		
		String b = "";
		
		String c = "abcdefghijklmnopqrstuvwxz";
		
		printCharactersCount(a);
		System.out.println("--------------");
		
		printCharactersCount(b);
		System.out.println("--------------");
		
		printCharactersCount(c);
		System.out.println("--------------");

	}
	
	public static void printCharactersCount (String s1) {
		
		int i=0,j=0,temp=0,index;
		
		char c,d;
		
		if(s1 == null || s1.length() == 0) {
			System.out.println("The given String is null");
			return;
		}
		
		int count[] = new int[26];
		
		while(i<s1.length()) {
			c =s1.charAt(i);
			count[c-97]++;
			i++;
		}
		
		s1 = Removeduplicatecharacters.removeDuplicateCharacters(s1);
		
		while(j<s1.length()) {
			d = s1.charAt(j);
			index = d-97;
			if(count[index]>1) {
				temp++;
				System.out.println(d+":"+count[index]);
			}
			j++;
		}
		
		if(temp==0) {
			System.out.println("There is no duplicate characters");
			return;
		}
		
		return;
	}

}
