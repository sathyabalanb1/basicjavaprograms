package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skipelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		skipElements(input);

	}
	
	public static void skipElements (List<Integer>input) {
		
		List<Integer>result = input.stream()
									.skip(2)
									.collect(Collectors.toList());
		
		result.forEach(num -> System.out.print(num+","));
		
		System.out.println();
	}

}
