package com.chet.paytm;

import java.util.Scanner;

import com.chet.sap.Node;
import com.chet.sap.ReverseLinkedList;

public class ReverseLinkedListSubGroup {

	static Node head ;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		ReverseLinkedListSubGroup list = new ReverseLinkedListSubGroup();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list");
        list.printList(head);
        System.out.println();
        
        System.out.println();
        head = list.reverse(head,t);
        System.out.println("");
        System.out.println("Reversed linked list " + head.value);
        list.printList(head);	
       
        
		sc.close();
	}

	 private Node reverse(Node head2, int t) {
		 
		 int count = 0;
		 Node t1 = null,t2=null;
		 Node start = head2;
		 while(start!=null && count<t) {
			 t2 = start.next;
			 start.next= t1;
			 t1 = start;
			 start = t2;
			 count++;
		 }
		 if(t2!=null) {
			 head2.next=reverse(t2, t);
		 }
		 System.out.println(" return t1 " + t1.value);
		 return t1;
	 }

	void printList(Node node) {
		System.out.println();
	        while (node != null) {
	            System.out.print(node.value + " ");
	            node = node.next;
	        }
	    }
	 
}
