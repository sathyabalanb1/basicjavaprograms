package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findfirstword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>input = Arrays.asList("sathya","Swathi","Geetha","Selvi");
		List<String>input2 = Arrays.asList("anbu","hari","dharshan","francis");
		
		findFirstWord(input);
		findFirstWord(input2);

	}
	
	public static void findFirstWord (List<String>input) {
		
		Optional<String> firstWord = input.stream()
									.filter(word -> word.startsWith("S"))
									.findFirst();
		
		firstWord.ifPresentOrElse(System.out::println, ()-> System.out.println("none"));
	}

}
