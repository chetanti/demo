package com.chet.array;

import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=0;test<t;test++){
			int N= sc.nextInt();
			int[] a = new int[N];
			
			for(int i = 0;i<N-1;i++){
				a[i] = sc.nextInt();
			}
			
			for(int j=1;j<N-1;j++){
				if((a[j-1] + 1) != a[j]){
					System.out.println((a[j-1] + 1));
				}
			}
		}
		
	
	sc.close();

	}

}




/*
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int test=0;test<t;test++){
	int N= sc.nextInt();
	int[] a = new int[N];
	int actualsum = 0;
	int sum = (N*(N+1)/2);
	
	for(int i = 0;i<N-1;i++){
		a[i] = sc.nextInt();
		actualsum = actualsum+a[i]; 
	}
				
	System.out.println(sum-actualsum);
}


sc.close();*/

