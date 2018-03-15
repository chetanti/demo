package com.chet.sap;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			
			System.out.println(sc.nextLine().replaceAll(" ",""));
		}
		
		sc.close();
	}
}
