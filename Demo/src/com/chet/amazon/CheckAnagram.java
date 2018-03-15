package com.chet.amazon;

import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String str1 = sc.next();
		
		System.out.println(isAnagram(str,str1));
		sc.close();
	}

	private static boolean isAnagram(String str, String str1) {
		
		if(str.length() != str1.length())
			return false;
		int[] char_set = new int[256];
		for(int i = 0;i<str.length();i++) {
			char_set[str.charAt(i)]++;
			char_set[str1.charAt(i)]--;
		}
		for(int i =0;i<str.length();i++) {
			if(char_set[str.charAt(i)]!= 0)
				return false;
		}
		return true;
	}

}
