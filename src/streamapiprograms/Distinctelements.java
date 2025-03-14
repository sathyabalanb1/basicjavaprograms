package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinctelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(4,9,3,9,8,13,93,4,4,3,10,20,9,9,15);
		
		distinctElements(input);

	}
	
	public static void distinctElements (List<Integer>input) {
		
		List<Integer>result  = input.stream()
									.distinct()
									.collect(Collectors.toList());
		
		result.forEach(num -> System.out.print(num+","));
		System.out.println();
	}

}
