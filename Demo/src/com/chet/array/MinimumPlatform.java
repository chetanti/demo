package com.chet.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumPlatform {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
		
			int length = sc.nextInt();
			List<Integer> listOfA = new ArrayList<Integer>();
		    List<Integer> listOfD = new ArrayList<Integer>();
		    for(int j = 0; j< length; j++){
		        listOfA.add(sc.nextInt());
		    }
		   
		    for(int j = 0; j< length; j++){
		        listOfD.add(sc.nextInt());
		    }
		     int minPlatform = 1;
			    for(int i = 0; i < listOfA.size(); i++){
			        if(listOfA.get(i) > listOfD.get(i)){
			            int temp = listOfD.get(i) + 2400;
			            listOfD.set(i, temp);
			        }
			    }
			    Collections.sort(listOfA);
			    Collections.sort(listOfD);
			    
			    for(int j = 0; j< length; j++){
			        System.out.println(listOfA.get(j));
			    }
			    for(int j = 0; j< length; j++){
			    	 System.out.println(listOfD.get(j));
			    }
			    
			    int arr = 1;
			    int dep = 0;
			    int req = 1;
			    int n = listOfA.size();
			    while(arr < n && dep < n){
			    	//System.out.println("arr " + arr + dep + req + minPlatform);
			        if(listOfA.get(arr) < listOfD.get(dep)){
			            arr++;
			            req++;
			            if(req > minPlatform){
			                minPlatform = req;
			            }
			        }else{
			            req--;
			            dep++;
			        }
			    }
			    
			    System.out.println(minPlatform);
		}

		sc.close();
	}

}
