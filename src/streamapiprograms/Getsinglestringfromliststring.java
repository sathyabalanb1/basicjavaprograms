package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Getsinglestringfromliststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>input = Arrays.asList("reshma","monisha","srimathi","suganya");
		
		getSingleStringFromListString(input);

	}
	
	public static void getSingleStringFromListString (List<String>input) {
		
		String output = input.stream()
								.collect(Collectors.joining(","));
		
		System.out.println(output);
	}

}
