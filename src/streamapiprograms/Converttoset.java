package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Converttoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,4,5);
		
		convertToSet(input);

	}
	
	public static void convertToSet (List<Integer>input) {
		
		Set<Integer>result = input.stream()
									.collect(Collectors.toSet());
		
		result.forEach(num -> System.out.print(num+","));
		System.out.println();
	}

}
