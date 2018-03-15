package com.chet.sap;

import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalBinaryTree {

	static Node head ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		VerticalBinaryTree list = new VerticalBinaryTree();
        list.head = new Node(1);
        list.head.left = new Node(2);
        list.head.right = new Node(3);
        list.head.left.left = new Node(4);
        list.head.left.right = new Node(5);
        list.head.right.left = new Node(6);
        list.head.right.right = new Node(7);
        list.head.right.right.left = new Node(8);
        list.head.right.right.right = new Node(9);
      
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(list.head);
        System.out.println("Horisontal Order traversal is");
        printHorisontalOrder(list.head);
		sc.close();
	
		
	}
	private static void printVerticalOrder(Node root) {
		TreeMap<Integer,List<Integer>> m = new TreeMap<>();
        int hd =0;
        getVerticalOrder(root,hd,m);
        
        for (Entry<Integer, List<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }
        
	}
	private static void printHorisontalOrder(Node root) {
		TreeMap<Integer,List<Integer>> m = new TreeMap<>();
        int hd =0;
        getHorisontalOrder(root,hd,m);
        
        for (Entry<Integer, List<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }
        
	}
	private static void getHorisontalOrder(Node root, int hd, TreeMap<Integer, List<Integer>> m) {
		if(root == null)
            return;
		//System.out.println("node " + root.value);
		 List<Integer> get =  m.get(hd);
		 
		 if(get == null)
		 {
			 get = new Vector<>();
			 get.add(root.value);
	     }
		 else
			 get.add(root.value);
		  
		 
		 m.put(hd, get);
		// System.out.println(" hd = " + hd);
		 getHorisontalOrder(root.left,hd+1,m);
		 
		 getHorisontalOrder(root.right,hd+1,m);
		 
	}
	private static void getVerticalOrder(Node root, int hd, TreeMap<Integer, List<Integer>> m) {
		if(root == null)
            return;
        // System.out.println("node " + root.value);
		 List<Integer> get =  m.get(hd);
		 
		 if(get == null)
		 {
			 get = new Vector<>();
			 get.add(root.value);
	     }
		 else
			 get.add(root.value);
		 
		 m.put(hd, get);
		// System.out.println(" hd = " + hd);
		 getVerticalOrder(root.left, hd-1, m);
		 getVerticalOrder(root.right, hd+1, m);
	}
	
}
