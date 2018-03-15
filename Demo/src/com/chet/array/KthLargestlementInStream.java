package com.chet.array;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestlementInStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int N= sc.nextInt();
			int K = sc.nextInt();
			int arr[] = new int[N];
			for(int i =0;i<N;i++) {
				arr[i] = sc.nextInt();
				if(i<(K-1)) {
					System.out.print("-1");
				}else {
					Arrays.sort(arr);
					for(int j =0;j<i;j++) {
						System.out.println(arr[j]);
					}
					System.out.print(arr[i-K +1]);
				}
			}
			
			
			
		}
		sc.close();

	}

}
