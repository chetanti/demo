package com.chet.array;

import java.util.ArrayList;
import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int N = sc.nextInt();
	    	int sum = 0;
	    	ArrayList<Integer> A = new ArrayList<>(N);
		    for (int n = 0; n < N; n++) {
		        int a = sc.nextInt();
		        A.add(a);
		        sum += a;
		    }
		    
		    if (N == 1) {
		        System.out.println("1");
		        continue;
		    }
		    
		    int currentSum = 0;
		   int i = 0;
		    for (; i < N-1; i++) {
		        currentSum += A.get(i);
		        if (currentSum == sum - currentSum - A.get(i+1)) {
		            System.out.println(i+2);
		            break;
		        }
		    }
		    if (i == N-1)
		        System.out.println("-1");
		    
		    
		}
		sc.close();
	}

}


/*
 * input 1,3,5,2,2
 * output : 3 (5)
 */
