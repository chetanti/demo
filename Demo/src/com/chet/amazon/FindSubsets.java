package com.chet.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindSubsets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int size = sc.nextInt();
			
			List<Object> arr = new ArrayList<>();
			
			for(int i =0;i<size;i++) {
				arr.add(sc.next());
			}
			
			Set<Set<Object>> set = getSubSets(arr);
			for(Set<Object> set1 : set) {
				for(Object obj: set1) {
					System.out.println(obj);
				}
			}
		}
		sc.close();

	}

	private static Set<Set<Object>> getSubSets(List<Object> list) {
		Set<Set<Object>> subsets = new HashSet<Set<Object>>(); 
		
		subsets.add(new HashSet<Object>());
		 

        /*for(Object o : arr)
        {
        	Set<Set<Object>> temp = new HashSet<Set<Object>>();
        	for(Set<Object> s: subsets)
        		temp.add(new HashSet<Object>(s));

        	for (Set<Object> s : temp)
        		s.add(o);

        	subsets.addAll(temp);
        }      */
		for(int i = 0; i < Math.pow(2, list.size()); i++)
        {
			Set<Object> subset = new HashSet<Object>();

			int j = 1;
			for(int k = 0; k < list.size(); k++ )
			{
				if((j & i) != 0)
				{
					subset.add(list.get(k));
				}
				j = j << 1;
			}

			subsets.add(subset);
        }

        return subsets;
	}

}
