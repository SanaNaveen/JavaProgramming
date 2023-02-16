package LambdaExpression;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBiFunction {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> operator = e -> e*2;
		
		System.out.println("Multiplication: "+operator.apply(10));
		
		BiFunction<String, String, Integer> lenthOfTwoString = (a,b) -> (a+b).length();
		
		System.out.println("Length of Two String: "+lenthOfTwoString.apply("sana", "naveen"));
		
		
		BinaryOperator<String> binaryOperator = (a,b) -> a+"."+b;
		
		System.out.println(binaryOperator.apply("naveenshanmugam", "me"));
		
		
		
	}

}
