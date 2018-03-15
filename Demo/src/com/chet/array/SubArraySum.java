package com.chet.array;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int s= sc.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int sum = 0;
			boolean flag = false;
			for(int p =0;p<n;p++) {
				sum = a[p];
				
				for(int q=p+1;q<n;q++) {
					sum = sum + a[q];
					
					if(sum==s) {
						System.out.println((p+1) + " " + (q+1));
						flag = true;
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			if(!flag) {
				System.out.println("-1");
			}
		}
		sc.close();
	}

}
