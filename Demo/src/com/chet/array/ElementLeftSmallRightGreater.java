package com.chet.array;

import java.util.Scanner;

public class ElementLeftSmallRightGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		while(t-->0) {
			
			int n = sc.nextInt();
			boolean flag = false;
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    
		    int[] l = new int[n];
		    int[] r = new int[n];
		    
		    l[0]=arr[0];
		    for(int i=1;i<n;i++){
		    	l[i] = Math.max(l[i-1],arr[i]);
		    }
		    r[n-1] = arr[n-1];
		    for(int i=n-2;i>=0;i--){
		    	r[i] = Math.min(r[i+1],arr[i]);
		    }
		    for(int i=1;i<n-1;i++){
		    	if(l[i]==r[i]){
		    		System.out.print(arr[i]);
		    		flag = true;
		    		break;
		    	}
	       }   
		    
		    if(!flag)System.out.print("-1");
		    System.out.println();  
		}
		sc.close();
	}
}
