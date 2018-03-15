package com.chet.sap;

import java.util.Scanner;

public class ReverseLinkedList {

	static LinkedList head ;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		head = new LinkedList(85);
        head.next = new LinkedList(15);
        head.next.next = new LinkedList(4);
        head.next.next.next = new LinkedList(20);
         
        System.out.println("Given Linked list");
        printList(head);
        head = reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(head);
		sc.close();
	}
	
	 static void printList(LinkedList node) {
	        while (node != null) {
	            System.out.print(node.value + " ");
	            node = node.next;
	        }
	    }
	 
	static LinkedList reverse(LinkedList head)
	   {
		if (head == null || head.next == null)
            return head;
            
		LinkedList reversed = reverse(head.next);
        System.out.println("a");
        System.out.println(head.value);
        head.next.next = head;
        head.next = null;
        return reversed;
		
		/*if(head.next != null) {
			System.out.println(head.next);
			reverse(head.next);
		}
		return head;*/
	      
	   }
}
