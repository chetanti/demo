package com.chet;

import java.math.BigInteger;
import java.util.*;

public class MinimumProductKIntegers {

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
			int k = sc.nextInt();	
			BigInteger product = new BigInteger("1");
			for(int i = 0;i<k;i++) {
				product = product.multiply(BigInteger.valueOf(arr[i]));
			}
			
			System.out.println(product.mod(new BigInteger("1000000007")));
 		}
		sc.close();
	}

}
