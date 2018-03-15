package com.chet;

import java.util.Scanner;

public class SudokuNew {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int mat[][]=new int[9][9];
		    for(int i=0;i<9;i++){
		        for(int j=0;j<9;j++){
		            mat[i][j]=sc.nextInt();
		        }
		    }
		    boolean flag=solve(mat,0,0);
		    if(flag){
		     for(int i=0;i<9;i++){
		        for(int j=0;j<9;j++){
		            System.out.print(mat[i][j]+" ");
		        }
		    }   
		    }
		    System.out.println();
		}
	sc.close();
	}

	static boolean solve(int mat[][],int i,int j){
	    if(i==9){
	        return true;
	    }
	    if(j==9){
	        return solve(mat,i+1,0);
	    }
	    if(mat[i][j]!=0){
	            return solve(mat,i,j+1);
	    }
	    for(int k=1;k<=9;k++){
	        if(isSafe(mat,i,j,k)){
	        	System.out.println("assign k at i & J " + k + i + j);
	            mat[i][j]=k;
	            if(solve(mat,i,j+1))
	            return true;
	        }
	    }
	    mat[i][j]=0;
	    return false;
	}
	static boolean isSafe(int mat[][],int i,int j,int num){
		
	    for(int k=0;k<9;k++){
	        if(mat[i][k]==num || mat[k][j]==num){
	        	System.out.println("i " + i + " j " + j + " num " + num );
	            return false;
	        }
	    }
	    
	    int sti=(i/3)*3;
	    int stj=(j/3)*3;
	   System.out.println("sti " + sti  + " stj "+ stj + "num" + num);
	    for(int m=sti;m<sti+3;m++){
	        for(int n=stj;n<stj+3;n++){
	            if(mat[m][n]==num){
	                    return false;
	            }
	        }
	    }
	    return true;
	}
}