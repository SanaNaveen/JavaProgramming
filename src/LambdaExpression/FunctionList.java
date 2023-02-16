package LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class FunctionList {
	
	public static void main(String[] args) {
		
		Function<String, Integer> lengthFunction = e -> e.length();
		
		List<String> nameList = new ArrayList<>();
		nameList.add("sana");
		nameList.add("naveen");
		nameList.add("dhanush");
		
		System.out.println(findLength(nameList,lengthFunction));
		
	}
	
	
	public static <T,R> List<R> findLength(List<T> list,Function<T, R> function) {
	
		List<R> finalList = new ArrayList<>();
		for(T e: list) {
			finalList.add(function.apply(e));
		}
		
		return finalList;
	}

}
