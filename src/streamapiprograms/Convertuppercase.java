package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convertuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>input = Arrays.asList("sathya","bala","cat","dog");
		
	//	convertToUpperCase(input);
		
		convertToUpperCaseAttempt2(input);

	}
	
	public static void convertToUpperCase (List<String>input) {
		
		List<String> result = input.stream()
									.map(str -> str.toUpperCase())
									.collect(Collectors.toList());
		
		result.forEach(word -> System.out.println(word));
	}
	
	public static void convertToUpperCaseAttempt2 (List<String>input) {
		
		List<String> result = input.stream()
									.map(String::toUpperCase)
									.collect(Collectors.toList());
		
		result.forEach(word -> System.out.println(word));
	}

}
