package com.chet.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EvenLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int size = sc.nextInt();
			
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i =0;i<size;i++) {
				list.add(sc.nextInt());
			}
			
			
			List<List<Integer>> finalist = new ArrayList<List<Integer>>();
			
			finalist = makeLists(list);
			
			for(List<Integer> list1 :finalist) {
				System.out.println(" new list");
				for(int i =0;i<list1.size();i++)
					System.out.println(list1.get(i));
				
					
			}
		}
		sc.close();
	}

	private static List<List<Integer>> makeLists(List<Integer> list) {
		
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        
		List<Integer> list1 = new ArrayList<Integer>();
		int list1total = 0;
		List<Integer> list2 = new ArrayList<Integer>();
		int list2total = 0;
		
		Collections.sort(list);
		
		for(int i=list.size()-1;i>0;i--) {
			if(list1total <list2total && list1.size() < list.size()/2) {
				list1.add(list.get(i));
				list1total +=list.get(i);
			}else {
				list2.add(list.get(i));
				list2total += list.get(i);
			}
		}
		
		lists.add(list1);
		lists.add(list2);
		return lists;
	}

}
