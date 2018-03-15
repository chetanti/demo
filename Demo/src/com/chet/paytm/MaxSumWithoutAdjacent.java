package com.chet.paytm;

import java.util.Scanner;

public class MaxSumWithoutAdjacent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			
			if(N==1){
			      System.out.println(arr[0]);
			}
			else{
				int[] dp=new int[N];
		         dp[0]=arr[0];
		         dp[1]=Math.max(arr[0],arr[1]);
		         
		         for(int j=2;j<N;j++)
			     {	
			         dp[j]=Math.max(dp[j-1],arr[j]+dp[j-2]);
			        
				 }
		         System.out.println(dp[N-1]);
			}
		}

		sc.close();
	}

}

