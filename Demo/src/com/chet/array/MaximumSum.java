package com.chet.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			int[] T = new int[arr.length];
		    int max = arr[0];
		    T[0] = arr[0];
		    
		    for(int i=1;i<size;i++)
		    {
		        T[i] = arr[i];
		        for(int j=0;j<size;j++)
		        {
		            if(arr[i]>arr[j])
		            {
		                if(T[j]+arr[i] > T[i])
		                  {
		                	System.out.println("max " + max + " j " + j  + " i " + i);
		                	System.out.println("Adding  " + T[j] +"--" +  arr[i]);
		                      T[i] = T[j]+arr[i];
		                      if(max < T[i]) {
		                    	  
		                        max = T[i];
		                      }
		                  }
		            }  
		        }
		    }
			System.out.println(max);
		}
		sc.close();
	}
}
