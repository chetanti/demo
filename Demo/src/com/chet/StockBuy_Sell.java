package com.chet;

import java.util.Arrays;
import java.util.Scanner;

public class StockBuy_Sell {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = 0;
			for(int i = 0;i<size;i++) {
				for(int j =i +1;j<size;j++) {
					//if(arr[i])
				}
			}
 		}
		sc.close();
	}

}
