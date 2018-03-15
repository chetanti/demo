package com.chet.sap;

import java.util.Scanner;

public class GCDArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int size = sc.nextInt();
			
			int[] arr= new int[size];
			
			for(int i =0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			int gcdAll = arr[0];
			for(int i=1; i<size; i++)
	            gcdAll = gcd(gcdAll, arr[i]);
			
			System.out.println(gcdAll);
		}
		sc.close();
	}
	
	static int gcd(int a, int b) {
		System.out.println(" a " + a + b);
	    if(b==0)
	        return a;
	    return gcd(b, a%b);
	}

}
