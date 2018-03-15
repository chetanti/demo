package com.chet.sap;

import java.util.Scanner;

public class LCM_GCD {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int gcd = GCD(a, b);
			int lcm = (a*b)/gcd;
			   
			System.out.println("lcm " + lcm + " gcd " + gcd);
		}
		
		sc.close();
	}
	
	public static int GCD(int a, int b){
	    if(b == 0)
	        return a;
	    return GCD(b, a%b);
	}

}
