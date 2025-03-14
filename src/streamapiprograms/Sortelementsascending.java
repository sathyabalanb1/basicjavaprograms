package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortelementsascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>input = Arrays.asList(8,4,9,12,3,25,17,20);
		
		sortElements(input);

	}
	
	public static void sortElements (List<Integer>input) {
		
		List<Integer>result = input.stream().sorted()
								.collect(Collectors.toList());
		
		System.out.println("After Sorting: "+result);
	}

}
