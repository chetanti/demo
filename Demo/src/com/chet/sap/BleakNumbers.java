package com.chet.sap;

import java.util.Scanner;

public class BleakNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int ans = 0;
		while(t-->0){
			int n = sc.nextInt();
			if(n==1)
		        ans=1;
		     for(int j =1; j<n; j++){
		        if(j+countSetBits(j)==n){
		        	System.out.println("n " + n);
		            ans =0;
		            break ;
		        }
		        else
		            ans=1;
		    }
		    System.out.println(ans);
			
		}
		sc.close();
	}
	
	private static int countSetBits(int x) {
		int count=0;
	    while(x!=0){
	        x &= (x-1);
	        System.out.println("x " + x);
	        count++;
	    }
	    System.out.println(count);
	    return count;
	}
}
