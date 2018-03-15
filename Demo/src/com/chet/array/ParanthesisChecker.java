package com.chet.array;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			String str = sc.next();
			int len = str.length();
			
			boolean balanced = true;
			
			Stack<Character> stack = new Stack<Character>();
			
			for(int i=0;i<len ;i++)
		    {
				char ch = str.charAt(i);
				if(ch == '{' || ch == '(' || ch=='[')
		        {
		            stack.push(ch);
		        }
				else if(ch == '}' || ch == ')' || ch==']') {
					if(stack.empty())
		            {
		                System.out.println("not balanced");
		                balanced= false;
		                break;
		            }
					char top = stack.pop();
					System.out.println(" ch " + ch + " top " + top + stack.size());
		            if((top == '{' && ch !='}') || (top == '(' && ch !=')')|| (top == '[' && ch !=']'))
		            {
		                System.out.println("not balanced");
		                balanced= false;
		                break;
		            }
				}
		    }
			if(stack.empty() && balanced)
		    {
		         System.out.println("balanced");
		    }else if(balanced)
		    {
		         System.out.println("not balanced");
		    }
		}
		sc.close();

	}

}
