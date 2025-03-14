package basicjavaprogams;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepeatedcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character ans;
		ans=firstNonRepeatedCharacter("Morning");
		System.out.println(ans);
		
		ans=firstNonRepeatedCharacter("aabbccddee");
		System.out.println(ans);
		
		ans=firstNonRepeatedCharacter("1234567891");
		System.out.println(ans);

	}
	
	public static Character firstNonRepeatedCharacter (String s1) {
		
		Map<Character,Integer>countMap = new LinkedHashMap<>();
		
		for(char ch:s1.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		
		for(char c:s1.toCharArray()) {
			if(countMap.get(c)==1) {
				return c;
			}
		}
		
		return null;
	}

}
