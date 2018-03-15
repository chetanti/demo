package com.chet.array;

import java.util.Scanner;

public class KadaneAlog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int N= sc.nextInt();
			int[] a = new int[N];
			
			for (int i = 0 ; i <N ; i++){
				a[i] = sc.nextInt();
			}
			int finalSum = kadane(a,N);
		
		    System.out.println(finalSum);
		}
		sc.close();
	}
	
	static int kadane(int a[],int n){
        int x=0,y=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            x=x+a[i];
            y=Math.max(x,y);
            if(x<0)
                x=0;
        }
        return y;
    }

}

/*Input
2
3
1 2 3
4
-1 -2 -3 -4
Output
6
-1*/