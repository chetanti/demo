package com.chet;

class Fish {
	 String name = "fish ";
	 String eat() { return "fish eats"; }
}
class B extends Fish {
	 String name = "shark ";
	 String eat() { return "shark eats"; }
}
public class A {
	static String s = "-";
	 public static void main(String[] args) {
		 int[][] x = {{4,5,}, {6,7}};
		  int[] y = (int[]) x[1];
		  Object ob = x;
		  int[][] x2 = (int[][]) ob;
		  int[] x3 = (int[]) ob;
		  System.out.println(y[1]);
	 }
	 static void add(Fish[]... a2) { s += "4"; }
	 static void add(B[]... b1) { s += "3"; }
	 static void add(B[] b1) { s += "2"; }
	 static void add(Object o) { s += "1"; }
}
