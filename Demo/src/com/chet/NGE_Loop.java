package com.chet;

import java.util.*;

public class NGE_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		while(t-->0) {
			
			int size = sc.nextInt();
			int[] arr = new int[size]; 
			for(int i = 0;i<size;i++) {
			
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0 ;i <size;i++) {
				
				for(int j = i +1;j<size;j++) {
					//System.out.println(arr[i] + " " + arr[j]);
					
					if(arr[i] < arr[j]) {
						System.out.println(arr[j]);
						break;
					}
					else if (j == (size-1)) {
						System.out.println("-1");
						break;
					}
				}
				if(i==(size -1)) {
					System.out.println("-1");
					break;
				}
			}
		}
		
		sc.close();

	}

}



/*a) For any array, rightmost element always has next greater element as -1.
b) For an array which is sorted in decreasing order, all elements have next greater element as -1.
c) For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.

Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.

  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12     -->     -1*/