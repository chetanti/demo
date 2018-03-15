package com.chet.sap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(t-->0) {
			int n = sc.nextInt();
			list.add(n);
			Collections.sort(list);
			int mean = (list.size())/2;
			if(list.size()%2==0) {
				System.out.println((list.get(mean) + list.get(mean-1))/2);
			}else {
				System.out.println(list.get(mean));
			}
			
		}
		sc.close();

	}
}
