package LambdaExpression;


//To use generics type in Functional Interface

@FunctionalInterface
interface MyGenericInterface<T,R>{
	
	R execute(T t);
}

public class GenericFunctionInterface {

	public static void main(String[] args) {
		
		MyGenericInterface<String,String> myGenericInterface = s -> s.substring(0,3);
		
		MyGenericInterface<String,Integer> myGenericInterface1 = s -> s.length();
		
		String subString = myGenericInterface.execute("Sana Naveen");
		
		Integer lengthOfString = myGenericInterface1.execute("Sana Naveen");
		
		System.out.println(subString);
		
		System.out.println(lengthOfString);
		
		
		
		
		
	}
	
}
