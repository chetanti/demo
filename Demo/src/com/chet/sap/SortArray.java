package com.chet.sap;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			 int hash[] = new int[3];
			  
			 for (int i = 0; i < size; i ++){
			     hash[sc.nextInt()]++ ;
			    // System.out.println(hash);
			    }
			  
			 for(int j: hash){
			        System.out.print(j + " ");
			    }
			 
			    int index = 0;
			    for( int i = 0; i < 3; i++){
			   
			        while(hash[i]-- > 0){
			            arr[index] = i;
			            index++;
			        }
			    }
			 
			    for(int j: arr){
			        System.out.print(j + " ");
			    }
			   System.out.println(); 
		}
		sc.close();
	}

}
