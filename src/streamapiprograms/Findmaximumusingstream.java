package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Findmaximumusingstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(9,5,3,16,11,28,26,9,19);
		
	//	findMaximumUsingStream(input);
		
	//	findMaximumUsingReduce(input);
		
		findMaximum(input);

	}
	
	public static void findMaximumUsingStream (List<Integer>input) {
		
		Optional<Integer>result = input.stream()
				.max(Integer::compareTo);
		
	//	max(Comparator<T>) processes all elements in the stream to find the maximum.
		
		result.ifPresent(maxNumber -> System.out.println("Max Number is: "+ maxNumber)); 
				
	}
	
	
	public static void findMaximumUsingReduce (List<Integer>input) {
		
		Optional<Integer>result = input.stream()
										.reduce((a,b) -> a>b ? a:b);
		
		result.ifPresent(System.out::println);
	}
	
	public static void findMaximum (List<Integer>input) {
		
		BinaryOperator<Integer> maxOperator = (a,b)-> a>b ? a:b;
		Optional<Integer>result = input.stream().reduce(maxOperator);
		
		result.ifPresent(System.out::println);
	}

}
