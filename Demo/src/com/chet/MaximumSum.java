package com.chet;

import java.util.*;

public class MaximumSum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			int sum = 0;
			for(int i = 0;i<size;i++) {
				sum = sum + arr[i] * i;
			}
			
			System.out.println(sum);
 		}
		sc.close();
	}

}
