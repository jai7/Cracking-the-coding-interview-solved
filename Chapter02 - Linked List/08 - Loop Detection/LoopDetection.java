package com.chapter.linkedlists;

import java.util.HashSet;
import java.util.Set;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class LoopDetection {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n5 = new Node(5);
		LinkedList list1 = new LinkedList();
		list1.head = n1;
		list1.head.next = n2;
		list1.head.next.next = n3;
		list1.head.next.next.next = n5;
		list1.head.next.next.next.next = n3;
		Node node = getLoopStartingUsingFloydTheorem(list1.head);
		if(null != node){
			System.out.println("The loop is detected at " + node.getData());
		} else {
			System.out.println("There is no loop detected.");
		}

	}

	private static Node getLoopStartingNode(Node head) {
		Set<Node> set = new HashSet<Node>();
		if(null == head)
			return null;
		while(null != head){
			if(set.contains(head))
				return head;
			set.add(head);
			head = head.next;
		}
		return null;
	}
	
	private static Node getLoopStartingUsingFloydTheorem(Node head) {
		
		if(null == head)
			return null;
		Node slow_ptr = head, fast_ptr = head;
		while(null != slow_ptr && null != fast_ptr && null != fast_ptr.next){
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if(slow_ptr == fast_ptr){
				System.out.println("Loop detected...");
				slow_ptr = head;
				while(null != slow_ptr && null != fast_ptr){
					if(slow_ptr == fast_ptr)
						return slow_ptr;
					slow_ptr = slow_ptr.next;
					fast_ptr = fast_ptr.next;
				}
			}
		}
		
		return null;
	}

}
