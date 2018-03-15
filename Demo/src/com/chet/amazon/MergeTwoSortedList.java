package com.chet.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			int size = sc.nextInt();
			int size1 = sc.nextInt();
			int[] arr = new int[size];
			int[] arr1 = new int[size1];
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0;i<size1;i++) {
				arr1[i] = sc.nextInt();
			}
			
			Object[] mergedarr = merge(arr,arr1);
			
			for(int i=0;i<mergedarr.length;i++) {
				System.out.println(mergedarr[i]);
			}
		}
		
		sc.close();
	}

	private static Object[] merge(int[] arr, int[] arr1) {
		List<Integer> mergerlist = new ArrayList<Integer>();
		System.out.println(" Inside merger ");
		int a = 0;
		int b = 0;
		
		Integer i = null;
		
		while(a < arr.length && b < arr1.length) {
		
			if(arr[a] < arr1[b]) {
				if(i ==null || i < arr[a]) {
					i = arr[a];
					mergerlist.add(i);
				}
				a++;
			}
			else {
				if(i ==null || i < arr1[b]) {
					i = arr1[b];
					mergerlist.add(i);
				}
				b++;
			}
		}
		while(a < arr.length)
        {
			if(i == null || i < arr[a])
			{
				i = arr[a];
				mergerlist.add(i);
			}

			a++;
        }
		while(b < arr1.length)
        {
			if(i == null || i < arr1[b])
			{
				i = arr1[b];
				mergerlist.add(i);
			}

			b++;
        }
		return mergerlist.toArray();
	}

}
