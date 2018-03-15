package com.chet.amazon;

import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			
			
			System.out.println(isUniqueChar(str));
		}
		sc.close();
	}

	private static boolean isUniqueChar(String str) {
		boolean flag = true;
		
		boolean[] char_set = new boolean[256];
		for(int i = 0 ; i<str.length() ; i++) {
			int val = str.charAt(i);
			
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return flag;
	}

}
