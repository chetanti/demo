package com.chet.sap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MinimumStack {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x =0;
		while(t-->0) {
			Stack st = new Stack<>();
			Queue<Integer> q = new PriorityQueue<>();
			int k = sc.nextInt();
			for(int i =0;i<k;i++) {
				int n = sc.nextInt();
				if(n==1) {
					x = sc.nextInt();
					st.push(x);
					q.add(x);
				}else if(n==2) {
					int val = (int) st.pop();
					System.out.print(val);
					q.remove(val);
				}else if(n==3) {
					System.out.print(q.peek());
				}
			}
			
			
		}
		sc.close();
	}
}
