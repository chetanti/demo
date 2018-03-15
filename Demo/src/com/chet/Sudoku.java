package com.chet;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			
			int arr[][] = new int[9][9];
			int arr1[][] = new int[9][9];
			for(int i =0;i<9;i++) {
				for(int j = 0;j<9;j++) {
					
					arr[i][j] = sc.nextInt();
				}
			}
			
			/*for(int i =0;i<9;i++) {
				for(int j = 0;j<9;j++) {
					
					System.out.print(arr[i][j] + " ");
				}
			}*/
			//System.out.println();
			for(int i =0;i<9;i++) {
				for(int j = 0;j<9;j++) {
					if(arr[i][j] == 0) {
						for(int k=1;k<10;k++) {
							if(checkIsCorrect(k,i,j,arr1)) {
								System.out.println("k " + k);
								arr1[i][j] = k;
								break;
							}
						}
					}else {
						System.out.println("else");
						arr1[i][j] = arr[i][j];
					}
				}
			}
			
			for(int i =0;i<9;i++) {
				for(int j = 0;j<9;j++) {
					
					System.out.print(arr1[i][j] + " ");
				}
			}
		}
		sc.close();
	}

	private static boolean checkIsCorrect(int k,int p,int q,int arr[][]) {
		//System.out.println("inside k " + k + p + q );
		for(int i=0;i<9;i++) {
			if(arr[p][i] == k) {
				System.out.println("1 if " +k + p + i);
				return true;
			}
				
		}
		
		for(int j= 0;j<9;j++) {
			if(arr[j][q]==k) {
				System.out.println("2 if" + k + j  + q);
				return true;
			}
		}
		return false;
	}

}
