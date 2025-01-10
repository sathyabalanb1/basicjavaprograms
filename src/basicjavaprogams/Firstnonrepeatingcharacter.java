package basicjavaprogams;

public class Firstnonrepeatingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "morning";
		
		String s2 = "abcabblkcc";
		
		String s3 = "";
		
		String s4 = "aabbccdd";
		
		firstNonRepeatingCharacter(s1);
		
		firstNonRepeatingCharacter(s2);
		
		firstNonRepeatingCharacter(s3);
		
		firstNonRepeatingCharacter(s4);

	}
	
	public static void firstNonRepeatingCharacter (String s1) {
		
		int i=0,j=0,index;
		
		char c,d;
		
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
		
		while(j<s1.length()) {
			
			d=s1.charAt(j);
			index = d-97;
			
			if(count[index] == 1) {
				System.out.println("The First Non Repeated Character is: "+d);
				return;
			}
			j++;
		}
		
		System.out.println("There is No Unique Characters in the given String");
		return;
	}

}
