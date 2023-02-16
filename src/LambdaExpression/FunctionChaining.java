package LambdaExpression;

import java.util.function.Function;

class Squre{
	
	private int width;
	
	private int height;
	
	private int area;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	
	
}

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Squre, Integer> fun1 = s -> s.getArea();
		Function<Integer, Double>  fun2 = s -> Math.sqrt(s);
		
		Function<Squre, Double> fun3 = fun2.compose(fun1);
		
		Function<Squre, Double> fun4 = fun1.andThen(fun2);
		
		Squre squre = new Squre();
		
		squre.setArea(100);
		
	
		Double d =fun3.apply(squre);
		
		Double d1 = fun4.apply(squre);
		
		System.out.println(d);
		
		System.out.println(d1);
		
		
		
		
		
	}
	
}
