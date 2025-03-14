package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Elementsgreaterthanfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(4,1,5,9,3,3,6,10,2,14);
		
		countElementsGreaterThanFive(input);

	}
	
	public static void countElementsGreaterThanFive (List<Integer>input) {
		
		long total = input.stream()
				.filter(num -> num>5)
				.count();
		System.out.println(total);
		
	}

}
