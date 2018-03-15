package com.chet.amazon;

import com.chet.sap.Node;

public class BinarySearchTree {

	static Node head;
	public static void main(String[] args) {

		BinarySearchTree list = new BinarySearchTree();
		
		list.head = new Node(8);
        list.head.left = new Node(3);
        list.head.left.left = new Node(1);
        list.head.left.right = new Node(6);
        list.head.left.right.left = new Node(4);
        list.head.left.right.right = new Node(7);
        
        list.head.right = new Node(10);
        list.head.right.right = new Node(14);
        list.head.right.right.left = new Node(13);
        
        System.out.println(isBST(list.head, Integer.MIN_VALUE, Integer.MAX_VALUE));
        		
	}

	 public static boolean isBST(Node root, Integer min, Integer max)
     {
		 if(root == null)
			 return true;
		 
		 if(min != null && min >=root.value) {
			 return false;
		 }
		 if(max != null && max <= root.value)
			 return false;
		 
		 return isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
     }
}
