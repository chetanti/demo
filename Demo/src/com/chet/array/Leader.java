package com.chet.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int size = sc.nextInt();

			int[] arr = new int[size];
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = arr[size-1];
		    ArrayList<Integer>list = new ArrayList<Integer>();
		    list.add(max);
		    
		    for(int i = size-2;i>=0;i--) {
		    	if(arr[i]>max) {
		    		max = arr[i];
		    		list.add(max);
		    	}
		    }
		    
		    for(int j = list.size() -1 ;j>=0;j--) {
		    	System.out.print(list.get(j) + " ");
		    }
		    System.out.println();
		}
		sc.close();
	}

}
