package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Checkanymatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>input = Arrays.asList("babu","chandhra","divya","eashwar");
		
		List<String>input2 = Arrays.asList("babu","chandhra","divya","Aegan");
		
		checkAnyMatch(input);
		
		checkAnyMatch(input2);

	}
	
	public static void checkAnyMatch (List<String>input) {
		boolean ans = input.stream()
							.anyMatch(word -> word.startsWith("A"));
		
		System.out.println(ans);
	}

}
