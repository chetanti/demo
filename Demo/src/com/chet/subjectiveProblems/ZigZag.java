package com.chet.subjectiveProblems;

import java.util.Scanner;

public class ZigZag {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int count = 0;
			for(int i =1;i<=n;i++) {
				if((i%2) == 0)
				{
					count = count + (i-1);
					for(int j =0;j<i;j++) {
						System.out.print(count--);
						if(j!=i)
							System.out.print("*");
					}
					
					
				}
				else {
					count = count + i; 
					for(int j=1 ;j<=i;j++) {
						System.out.print(count++);
						if(j!=i)
							System.out.print("*");
					}
				}
				System.out.println();
			}
			if(n%2==0)
				count = count + n;
			else
				count = count -n;
			for(int i =n;i>0;i--) {
				
				if((i%2) == 0)
				{
					if(i<n){
						count = count - (i +2);
					}
					for(int j =0;j<i;j++) {
						System.out.print(count--);
						if(j!=i)
							System.out.print("*");
					}
					
					
				}
				else {
					if(i<n)
						count = count - (i -1); 
					for(int j=1 ;j<=i;j++) {
						System.out.print(count++);
						if(j!=i)
							System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
