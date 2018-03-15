package com.chet.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPermutations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			String s = sc.next();
			
			List<String> list = findPermutations(s);
			
			for(String str :list) {
				System.out.println(str);
			}	
		}
		sc.close();
	}

	private static ArrayList<String> findPermutations(String str) {
		ArrayList<String> permutations = new ArrayList<String>();
        permutations.add(new String());

        char [] strArray = str.toCharArray();
        
        for(char c : strArray) {
        	ArrayList<String> tempList = new ArrayList<String>();
        	 System.out.println(" c "+ c);
            for(String s: permutations)
            {
            	System.out.println(" s " + s);
            	for(int i = 0; i < s.length(); i++) {
            		System.out.println( " string is " + new String(s.substring(0, i) + c + s.substring(i, s.length() )));
                    tempList.add(new String(s.substring(0, i) + c + s.substring(i, s.length() )));
            	}
            	System.out.println(" last string is " + (s + c));
            	tempList.add(new String(s+c));
            }
            permutations = tempList;
        }
		return permutations;
	}

}
