package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<String> strList = Arrays.asList("sana","naveen","anil","dhanush","jack","jhon","deepression");
		
		//even number with multiply 10
		List<Integer> evenList = myList.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * 10)
				.collect(Collectors.toList());
		
		evenList.forEach(System.out::println);
		
		System.out.println("String sorting");
		//sorting string value
		strList.stream().sorted((o1, o2) -> {
			return -o1.toString().compareTo(o2.toString());
		}).forEach(System.out::println);
		
		System.out.println("String Ex1");
		
		strList.stream().filter(e -> e.contains("j"))
		.map(e -> e.concat("-hi"))
		.forEach(System.out::println);
		
		
		
		
	}
	
}
