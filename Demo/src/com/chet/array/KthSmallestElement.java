package com.chet.array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int N= sc.nextInt();
			
			int arr[] = new int[N];
			for(int i =0;i<N;i++) {
				arr[i] = sc.nextInt();
				
			}
			int K = sc.nextInt();
			
			Arrays.sort(arr);
			
			System.out.println(arr[K-1]);
		}
		sc.close();

	}

}
