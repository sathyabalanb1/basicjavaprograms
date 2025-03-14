package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Evennumbersstreamversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers = Arrays.asList(3,6,2,9,7,11,8,24,5,3,17);
		
		List<Integer>ans;
		ans=pickEvenNumbersList(numbers);
		System.out.println(ans);
		
		ans=pickEvenNumbersListAttempt2(numbers);
		System.out.println(ans);
		
		

	}
	
	public static List<Integer> pickEvenNumbersList (List<Integer>input){
		
		List<Integer>result = input.stream()
									.filter(num -> num%2==0)
									.collect(Collectors.toList());
		
		return result;
	}
	
	public static List<Integer> pickEvenNumbersListAttempt2 (List<Integer>input){
		
		Predicate<Integer>isEven = num -> num%2==0;
		
		List<Integer>result = input.stream()
									.filter(isEven)
									.collect(Collectors.toList());
		
		return result;
	}

}
