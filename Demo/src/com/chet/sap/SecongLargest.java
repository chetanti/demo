package com.chet.sap;

import java.util.Arrays;
import java.util.Scanner;

public class SecongLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int i = 0;i<size;i++) {
				arr[i]= sc.nextInt();
			}
			Arrays.sort(arr);
			
			System.out.println(arr[size-2]);
			
		}
		sc.close();
	}
}
