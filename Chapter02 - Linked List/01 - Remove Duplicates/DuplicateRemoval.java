package com.chapter.linkedlists;

import java.util.HashSet;
import java.util.Set;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class DuplicateRemoval {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node<Integer>(2);
		list.head.next = new Node<Integer>(4);
		list.head.next.next = new Node<Integer>(2);
		list.head.next.next.next = new Node<Integer>(6);
		list.head.next.next.next.next = new Node<Integer>(8);
		list.head.next.next.next.next.next = new Node<Integer>(6);
		list.head.next.next.next.next.next.next = new Node<Integer>(4);
		System.out.println("Before deleting the duplicate elements from linked list :");
		list.printList();
		deleteDuplicates(list.head);
		System.out.println("After deleting the duplicate elements from linked list :");
		list.printList();
	}
	
	static void deleteDuplicates(Node head){
		Set<Integer> set = new HashSet<Integer>();
		Node<Integer> current = head;
		Node<Integer> prev = null;
		while(null != current){
			if(set.contains(current.getData())){
				prev.next = current.next;
			} else {
				set.add(current.getData());
				prev = current;
			}
			current = current.next;
		}
		
	}

}
