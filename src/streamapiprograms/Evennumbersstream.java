package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Evennumbersstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers = Arrays.asList(3,6,2,9,7,11,8,24,5,3,17);
		
		List<Integer>ans;
		ans=getEvenNumbersList(numbers);
		System.out.println(ans);
		

	}
	/*
	public static List<Integer> getEvenNumbersList (List<Integer>input){
		
		List<Integer>output = input.stream()
									.filter(num->num%2==0)
									.collect(Collectors.toList());
		
		return output;
	}
	*/
	public static boolean isEven (int n) {
		return n%2==0;
	}
	
	public static List<Integer> getEvenNumbersList (List<Integer>input){
		
		List<Integer>output = input.stream()
									.filter(Evennumbersstream::isEven)
									.collect(Collectors.toList());
		
		return output;
	}

}
