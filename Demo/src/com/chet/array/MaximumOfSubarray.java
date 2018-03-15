package com.chet.array;

import java.util.Scanner;

public class MaximumOfSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		while(t-->0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n ;i++) {
				arr[i] = sc.nextInt();
				
			}
			/*int i = 1;
			int max = arr[0];
			int count = 1;*/
			/*if(k>1) {
				while(i<n) {
					
					if(max <arr[i]) {
						max = arr[i];
						
					}
					
					i++;
					count++;
					if(count ==k) {
						count = 0; 
						i = i -k + 1;
						if((i+k - 1) <n )
							System.out.print(max + " ");
						else
							System.out.print(max);
						max = arr[i];
						//System.out.println("arr " + i  + arr[i]);
						//break;
					}
					
					
				}
			}else {
				i = 0;
				while(i<n) {
					if(i<(n-1))
						System.out.print(arr[i] + " ");
					else
						System.out.print(arr[i]);
					i++;
				}
			}*/
			for(int i = 0;i<=n-k;i++) {
				int max = arr[i];
				for(int j = i+1 ;j<i+k;j++) {
					if(max < arr[j]) {
						max = arr[j]; 
					}
				}
				if((i+k) <n)
					System.out.print(max + " ");
				else
					System.out.print(max);
			}
			System.out.println();
		}
		sc.close();

	}

}
