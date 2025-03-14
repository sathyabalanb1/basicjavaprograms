package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Findmaximumusingstreamversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(9,5,3,16,11,28,26,9,19);
		
		findMaximumAttempt1(input);
		
		findMaximumAttempt2(input);
		
		findMaximumAttempt3(input);

	}
	
	public static void findMaximumAttempt1 (List<Integer>input) {
		
		Optional<Integer>result = input.stream()
										.max(Integer::compareTo);
		
		result.ifPresent(num -> System.out.println("Max Number is "+num));
	}
	
	public static void findMaximumAttempt2 (List<Integer>input) {
		
		Optional<Integer> result = input.stream()
										.reduce((a,b)-> a>b?a:b);
		
		result.ifPresent(num-> System.out.println(num));
	}
	
	public static void findMaximumAttempt3 (List<Integer>input) {
		
		BinaryOperator<Integer>maxOperator = (a,b) -> a>b ?a:b;
		
		Optional<Integer>result = input.stream()
										.reduce(maxOperator);
		
		Consumer<Integer>printResult = num -> System.out.println(num);
		
		result.ifPresent(printResult);
							
	}

}
