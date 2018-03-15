package com.chet.sap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
			
			String str = sc.next();
			
			String[] str1 = str.split("\\.");
			List<String> l = new ArrayList<String>();
			
			for(String s :str1) {
				l.add(s);
			}
		
			Collections.reverse(l);
			int size = l.size();
			
			if(l.size()!=0)
			for(String w:l)
			{
				size--;
				if(size>0)
					System.out.print(w+'.');
				else
				{
					System.out.print(w);
					System.out.println();
				}
			}
			l.clear();
		}
		sc.close();
	}
	
}
