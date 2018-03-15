package com.chet.array;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			for(int i =0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			
			int student = sc.nextInt();
			
			Arrays.sort(arr);
			
			for(int i =0;i<N;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			int mindiff = arr[N-1];
			for(int i =0;i<N;i++) {
				int start = i;
				int end = start + student;
				if(end -1 < N) {
					int diff = arr[end-1] - arr[start];
					mindiff = Math.min(diff,mindiff);
				}
			}
			
			System.out.println(mindiff);
		}
		sc.close();
	}

}
