package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

//Lambda Expression Example 1

public class FindMinMax {

	public static void main(String[] args) {
		
		
		
		Thread myThread = new Thread(()->System.out.println("Thread Exceuted"));
		myThread.start();
		
		
		//The sum of even numbers 
		
		int sumOfEvens = IntStream.range(0, 100).filter(i -> i % 2 == 0)
				.reduce((x, y) -> x + y).getAsInt();
		
		System.out.println(sumOfEvens);
		
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(3);
		listOfIntegers.add(4);
		listOfIntegers.add(334);
		listOfIntegers.add(1);
		
		Optional<Integer> minNumber = listOfIntegers.stream().reduce((x,y) -> x < y ? x : y);
		minNumber.ifPresent(System.out::println);
		
		//another way of finding max number
		
		int maxNumber=listOfIntegers.stream().sorted().max(Integer::compare).get();
		System.out.println(maxNumber);
		
	}
	
}
