package com.chet.sap;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t-->0) {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
				
			}
			quickSort(arr,0,size-1);
			
			for(int i = 0;i<size;i++) {
				System.out.println(arr[i]);
				
			}
		}
		
		sc.close();
	}

	static void quickSort(int arr[], int low, int high)
	{
		System.out.println("low " + low + " high " + high);
	    if (low < high)
	    {
	    	QuickSort g = new QuickSort();
	        int pi = g.partition(arr, low, high);
	        quickSort(arr, low, pi-1);
	        System.out.println("second call " + (pi+1) + high);
	        quickSort(arr, pi+1, high);
	    } 
	}
	
	int partition(int a[], int low, int high)
    {
		int i=low-1,pivot=a[high];
		if(low<=high)
        {
			for(int j=low;j<high;j++)
            {
                if(a[j]<=pivot)
                {
                    i++;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
			int temp=a[i+1];
            a[i+1]=pivot;
            a[high]=temp;
            
        }
		for(int k = 0;k<5;k++) {
			System.out.println(a[k]);
			
		}
		
		System.out.println("i + 1 " + (i +1)); 
		return i+1;
		
    }
}
