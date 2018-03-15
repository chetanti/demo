package com.chet.array;

import java.util.Scanner;

public class ReverseArraySubGroup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0;i<N;i++) {
				arr[i] = sc.nextInt();
			}

			int K = sc.nextInt();
			
			for(int i =0;i<N;i = i+K) {
				for(int j = (i+K-1);j>=i ;j--) {
					
					if(j==N)
						continue;
					else if( i==(N-1)) {
						System.out.print(arr[i]);
						break;
						
					}
					else {
						System.out.print(arr[j] + " ");
					}
				}
			}
		}
		sc.close();

	}

}
