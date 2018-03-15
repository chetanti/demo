package com.chet.sap;

import java.util.Scanner;

public class NumberPower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			boolean flag = false;
		int i =0;
			while(i<y) {
				System.out.println(Math.pow(x, i));
				if(Math.pow(x, i)==y) {
					flag = true;
					break;
				}
				i++;
			}
			
			if(flag) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
		
		sc.close();
	}

}
