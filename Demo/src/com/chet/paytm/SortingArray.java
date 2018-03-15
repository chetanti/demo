package com.chet.paytm;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			
			int[] hash = new int[3];
			
			for(int i =0;i<N;i++) {
				hash[sc.nextInt()]++;
			}
			for(int j: hash){
				//System.out.print(j + " ");
			}
			 
			int index = 0;
		    for( int i = 0; i < 3; i++){
		   
		        while(hash[i]-- > 0){
		            arr[index] = i;
		            index++;
		        }
		    }
		    for(int j :arr) {
		    	System.out.println(j + " ");
		    }
			
		}
		
		sc.close();
	}
}
