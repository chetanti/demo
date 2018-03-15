package com.chet.subjectiveProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count = 0;
		if(n >9)
		{
			count = 9;
			for(int i =10;i<=n;i++) {
				ArrayList<Integer> list1 = permute(String.valueOf(i),0,(String.valueOf(i).length()-1),new ArrayList<Integer>());
				boolean flag = false;
				for(Integer no :list1) {
					if(no < i) {
						flag = true;
						break;
					}
				}
				if(!flag)
					count++;
				
			}
			
			//System.out.println("len " + String.valueOf(123).length());
			//System.out.println(swap("123", 0, 2));
			System.out.println();
			
			
			System.out.println(count);
		}
		else {
			System.out.println(n);
		}
		sc.close();
	}

	private static int getpermute(int number) {
		
		int reverse = 0;
		while(number != 0){
		       reverse = (reverse*10)+(number%10);
		       number = number/10;
		   }
		return reverse;
	}
	
	
	private static ArrayList<Integer> permute(String str, int l, int r,ArrayList<Integer> list)
    {
		//System.out.println(" l " + l + " r " + r);
		boolean flag = false;
		
        if (l == r)
        {
        	System.out.println("true " + str);
        	flag = true;
        	list.add(Integer.valueOf(str));
        }
        else
        {
        	System.out.println(" 1");
            for (int i = l; i <= r; i++)
            {
            	System.out.println(" 2");
                str = swap(str,l,i);
                System.out.println(" 3");
                permute(str, l+1, r,list);
                System.out.println(" 4");
                str = swap(str,l,i);
                System.out.println(" 5");
                System.out.println("last " + str);
            }
        }
        //System.out.println(" list =====" + list.size());
		return list;
        
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        //System.err.println("swap " + String.valueOf(charArray));
        return String.valueOf(charArray);
    }

}


/*int reverse = 0;
while(number != 0){
       reverse = (reverse*10)+(number%10);
       number = number/10;
   }
return reverse;*/