package com.demo.lambda;

public class LambdaDemo {
	
	public interface I1{
		int operation(int a, int b);
	}
	
	public interface I2{
		void sayhello(String msg);
	}
	
	private int operate(int a, int b, I1 iobj) {
		return iobj.operation(a, b);
	}
	
	public void process() {
		I1 add = (x, y) -> x + y;
		I1 multiply = (x, y) -> x * y;
		LambdaDemo lambda = new LambdaDemo();
		System.out.println("adding: "+lambda.operate(5, 5, add));
		System.out.println("multiplying: "+lambda.operate(5, 5, multiply));
		
		I2 sayhello = msg -> System.out.println("Hello -- "+msg);
		sayhello.sayhello("lambda");
		
	}

}
