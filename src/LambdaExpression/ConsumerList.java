package LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerList {
	
	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		nameList.add("sana");
		nameList.add("naveen");
		nameList.add("dhanush");
		
		Consumer<Object> consumer = e -> System.out.println(e);
		
		consumerFilter(nameList, consumer);
		
	}
	
	
	private static <T> void consumerFilter(List<T> list,Consumer consumer) {
		
		for (T t : list) {
			consumer.accept(t);
		}
	}

}
