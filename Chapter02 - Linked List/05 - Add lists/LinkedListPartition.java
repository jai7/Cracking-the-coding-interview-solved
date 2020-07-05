package com.chapter.linkedlists;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class LinkedListPartition {
	/**
	 * 
	 * Problem: Given a linked list and a value x, partition it such that all nodes
	 * less than x come before nodes greater than or equal to x. You should preserve
	 * the original relative order of the nodes in each of the two partitions.
	 * 
	 * For example, Given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
	 *
	 */
	public static void main(String[] args) {
		int[] data = {7, 4, 3, 2, 5, 2, 6, 9, 3};
		LinkedList list = LinkedList.buildLinkedList(data);
		list.printList();
		int k = 3;
		list.head = partitionEnhanced(list.head, k);
		list.printList();
	}
	
	public static Node partition(Node head, int value){
		Node lessRangeStart = null;
		Node lessRangeEnd = null;
		Node highRangeStart = null;
		Node highRangeEnd = null;
		Node iter1 = head;
		Node iter2 = null;
		if(null !=iter1 && null != iter1.next){
			iter2 = iter1.next;
		} else {
			return head;
		}
		// traverse from left end and get the first node which is smaller than value, assign it as lessRangeStart
		while(null != iter1 && null != iter2){
			if((int)iter2.getData() <= value){
				// if range start is not yet set then set it here also set lessRangeEnd to this
				// else set lessRangeEnd.next to this and make this as lessRangeEnd
				if(null != lessRangeStart){
					if(null != lessRangeEnd){
						Node temp = new Node(iter2.getData());
						lessRangeEnd.next = temp;
						lessRangeEnd = temp;
					} else {
						lessRangeEnd = new Node(iter2.getData());
						lessRangeStart.next = lessRangeEnd;
					}
				} else {
					lessRangeStart = new Node(iter2.getData());
				}
			} else {
				if(null != highRangeStart){
					if(null != highRangeEnd){
						Node temp = new Node(iter2.getData());
						highRangeEnd.next = temp;
						highRangeEnd = temp;
					} else {
						highRangeEnd = new Node(iter2.getData());
						highRangeStart.next = highRangeEnd;
					}
				} else {
					highRangeStart = new Node(iter2.getData());
				}
			}
			iter1 = iter1.next;
			iter2 = iter2.next;
		}
		lessRangeEnd.next = head;
		head.next = highRangeStart;
		return lessRangeStart;
	}
	
	public static Node partitionEnhanced(Node node, int value) {
		Node head = node;
		Node tail = node;

		/* Partition list */
		while (node != null) {
			Node next = node.next;
			if ((int)node.getData() <= value) {
				/* Insert node at head. */
				node.next = head;
				head = node;
			} else {
				/* Insert node at tail. */
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;

		return head;
	}

}
