package streamapiprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortelementsdescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(8,4,9,12,3,25,17,20);
		
	//	sortElementsDescending(input);
		
		sortElementsDescendingAttempt2(input);

	}
	
	public static void sortElementsDescending (List<Integer>input) {
		
		List<Integer>output = input.stream()
									.sorted(Comparator.reverseOrder())
									.collect(Collectors.toList());
		
		System.out.println("After Descending: "+output);
	}
	
	public static void sortElementsDescendingAttempt2 (List<Integer>input) {
		
		List<Integer>output = input.stream()
									.sorted((a,b)-> b.compareTo(a))
									.collect(Collectors.toList());
		
		System.out.println("Descending Order "+ output);
	}

}
