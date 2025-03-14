package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Calculatesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	//	calculateSum(input);
		
		calculateSumAttempt2(input);

	}
	
	/*
	public static void calculateSum (List<Integer>input) {
		
		int ans = input.stream()
						.reduce(0, Integer::sum);
		
		System.out.println(ans);
	}
	
	*/
	
	public static void calculateSumAttempt2 (List<Integer>input) {
		
		int ans = input.stream()
						.reduce(0, (a,b)-> a+b);
		
		System.out.println(ans);
	}

}
