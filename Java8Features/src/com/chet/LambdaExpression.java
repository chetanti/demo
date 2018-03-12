package com.chet;

public class LambdaExpression {

	interface MathOperation {
		int operation(int a, int b);
	 }
		
	interface GreetingService {
		void sayMessage(String message);
	 }
	   
	public static void main(String[] args) {
		
		LambdaExpression le = new LambdaExpression();
		
		//with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
	      MathOperation sub = (a, b) -> a - b;
	      System.out.println(" add function " + le.operate(2, 3, addition));
	      System.out.println(" sub function " + le.operate(4, 2, sub));
	      
	      GreetingService gs = message -> System.out.println(" hello " + message);
	      
	      gs.sayMessage("Nirav");
		
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
}
