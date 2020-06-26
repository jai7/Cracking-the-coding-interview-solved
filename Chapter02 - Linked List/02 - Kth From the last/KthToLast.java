package com.chapter.linkedlists;

import java.util.Optional;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class KthToLast {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node<Integer>(2);
		list.head.next = new Node<Integer>(4);
		list.head.next.next = new Node<Integer>(6);
		list.head.next.next.next = new Node<Integer>(7);
		list.head.next.next.next.next = new Node<Integer>(3);
		System.out.println("Elements in the list are ");
		list.printList();
		int k = 2;
		// get kth from the last element data in the linked list
		int value = getKthLastValue(list.head, k);
		System.out.format("The %d value from the last is %d", k , value);
		
	}
	
	public static int getKthLastValue(Node head, int posFromEnd){
		int lenOfList = LinkedList.findListLength(head);
		int posFromStart = lenOfList - posFromEnd + 1;
		Optional<Node> node = LinkedList.elementAtPos(head, posFromStart);
		return node.isPresent() ? (int)node.get().getData(): -1;
	}

}
