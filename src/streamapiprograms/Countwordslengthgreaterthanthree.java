package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Countwordslengthgreaterthanthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>input = Arrays.asList("sathya","cat","aa","abc","divya","nalayini","monisha");
		
		countWordsGreaterThanLength(input);

	}
	
	public static void countWordsGreaterThanLength (List<String>input) {
		
		long output = input.stream()
							.filter(word -> word.length()>3)
							.count();
		
		System.out.println(output);
	}

}
