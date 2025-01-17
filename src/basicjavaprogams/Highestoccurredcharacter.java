package basicjavaprogams;

import java.util.HashMap;
import java.util.Map;

public class Highestoccurredcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aaabdklzzbbybibzabbbmnbkl";
		
		String b = "";
		
		String c = "1222158756559153435";
		
		highestOccurredCharacter(a);
		
		highestOccurredCharacter(b);
		
		highestOccurredCharacter(c);

	}
	
	public static void highestOccurredCharacter (String s1) {
		
		if(s1 == null || s1.length()==0) {
			System.out.println("The given string is empty");
			return;
		}
		
		Map<Character,Integer>frequencyMap = new HashMap<>();
		
		for(char ch:s1.toCharArray()) {
			
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
		}
		
		char maxChar = '\0';
		int maxFrequency = 0;
		
		for(Map.Entry<Character, Integer>entry: frequencyMap.entrySet()) {
			if(maxFrequency<entry.getValue()) {
				maxFrequency = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		
		System.out.println(maxChar+":"+maxFrequency);
		return;
	}

}
