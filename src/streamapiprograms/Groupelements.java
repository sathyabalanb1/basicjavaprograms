package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person>input = Arrays.asList(new Person("sathyabalan",31),new Person("ramkumar",28),
							new Person("rajesh",31),new Person("hariharan",28),new Person("prasanna",20));
		
		groupElements(input);

	}
	
	public static void groupElements (List<Person>input) {
		
		Map<Integer,List<Person>>groupedByAge = input.stream()
												.collect(Collectors.groupingBy(Person::getAge));
		
	//	System.out.println(groupedByAge);
		
		groupedByAge.forEach((age,person) -> System.out.println("Age: "+age+","+"Name: "+person));
	}

}
