package com.chet.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    
		    if(n <3){
		    	n = sc.nextInt();
		    }
		    ArrayList<Integer> list = new ArrayList<Integer>(n);
		    List<Integer> list1 = new ArrayList<>();
		    
		    for(int i=0;i<n;i++) {
		    	int new1 = sc.nextInt();
		        list.add(new1);
		        list1.add(new1);
		        
		    }
		    int result = 0;
		    
		    
		    Collections.sort(list);
		    
		    int level = list.get(n-2);
		   // System.out.println("level " + level);
		    
		    int index = list1.indexOf(level);
		    //System.out.println(index); 
		
		    int k = 1;
		    while((index+k)<(n-1)) {
		    //	System.out.println("while " + k);
		    	result = result + (level - list1.get(index +k));
		    	k++;
		    }
		    System.out.println(result);
		}
		sc.close();
	
	
	}

}
