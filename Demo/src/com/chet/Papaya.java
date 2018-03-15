package com.chet;

import java.util.Date;
/*
public class StringOperations {

	private static int count = 0;
	Date d = new Date();
	void StringOperations() {
		count = 5;
	}
	public static void main(String[] args) {
		
		System.out.println(count);
		String str = getReverseString("chet");
		System.out.println(str);
	}
	
	public static String getReverseString(String str){
		System.out.println(" str " + str + str.charAt(0));
		if(str.length() <= 1){
		return str;
		}
		return (getReverseString(str.substring(1)) + str.charAt(0));
		}
}*/

public class Papaya extends Tree {
	 public static void main(String[] args) {
		 new Papaya().run();
	 }
	 void run() {
		 go(new Tree(), new Papaya());
		 go((Papaya) new Tree(), new Papaya());
	 }
	 void go(Tree t1, Papaya p1) {
		 Papaya p2 = (Papaya)t1;
		 Tree t2 = (Tree)p1;
	 }
}
class Tree { } 