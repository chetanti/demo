package com.chet;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		
		String s = "chetb";
		String s1 = "chetanti";
		
		System.out.println(s.compareTo(s1));
		
		Calendar date = Calendar.getInstance();
		System.out.println(date.getTime());
		
		date.setTime(new Date());
		date.add(Calendar.SECOND, -1);
		
		Date d1 = date.getTime();
		System.out.println(d1);
		String str = "";
		//System.out.println("inside " + str);
		
		str = str + "abc" + ",";
		
		if(str != "") {
			System.out.println("---" + str);
		}
		str = str.substring(0, str.length()-1);
		System.out.println(str);
		if(str.matches("\\d*"))
			System.out.println("true");
		else
			System.out.println(false);
	}
}
