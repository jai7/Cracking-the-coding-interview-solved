package com.chapter.linkedlists;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class MiddleNodeDeletion {
	/**
	 * 
	 * Problem: Implement an algorithm to delete a node in the middle (i.e., any
	 * node but the first and last node, not necessarily the exact middle) of a
	 * singly linked list, given only access to that node.
	 * 
	 * EXAMPLE lnput:the node c from the linked list a->b->c->d->e->f Result:
	 * nothing is returned, but the new linked list looks like a->b->d->e->f
	 *
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node<Integer>(2);
		list.head.next = new Node<Integer>(4);
		list.head.next.next = new Node<Integer>(6);
		list.head.next.next.next = new Node<Integer>(7);
		list.head.next.next.next.next = new Node<Integer>(3);
		System.out.println("Before deleting a node");
		list.printList();
		System.out.println("After deleting a node");
		deleteNode(list.head.next.next);
		list.printList();
	}
	
	static boolean deleteNode(Node n){
		if(n == null)
			return false;
		if(null == n.next)
			return false;
		n.next = n.next.next;
		return true;
	}

}
