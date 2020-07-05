package com.chapter.linkedlists;

import java.util.HashSet;
import java.util.Set;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class Intersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n5 = new Node(5);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		// build list 1
		list1.head = n1;
		list1.head.next = n2;
		list1.head.next.next = n3;
		list1.head.next.next.next = n8;
		// build list 2
		list2.head = n5;
		list2.head.next = n7;
		list2.head.next.next = n8;
		
		boolean doesIntersect = findIfIntersectsUsingLengths(list1, list2);
		System.out.println("The two lists intersect at a node : " + doesIntersect);
	}

	private static boolean findIfIntersects(LinkedList list1, LinkedList list2) {
		Node first = list1.head;
		Node second = list2.head;
		if(first == null || second == null)
			return false;
		while(null != second){
			Node temp = first;
			while(null != temp){
				if(temp.equals(second))
					return true;
				temp = temp.next;
			}
			second = second.next;
		}
		return false;
	}
	
	private static boolean findIfIntersectsUsingSet(LinkedList list1, LinkedList list2) {
		Node first = list1.head;
		Node second = list2.head;
		Set<Node> set = new HashSet<Node>();
		if(first == null || second == null)
			return false;
		while(null != first){
			set.add(first);
			first = first.next;
		}
		// check in traversal through second list, if set contains the node then intersection point exists else NO.
		while(null != second){
			if(set.contains(second))
				return true;
			second = second.next;
		}
		return false;
	}
	
	private static boolean findIfIntersectsUsingLengths(LinkedList list1, LinkedList list2) {
		Node first = list1.head;
		Node second = list2.head;
		if(first == null || second == null)
			return false;
		int firstLength = LinkedList.findListLength(first);
		int secondLength = LinkedList.findListLength(second);
		int diffOfSizes = firstLength - secondLength;
		if(diffOfSizes > 0){
			return getIntersection(diffOfSizes, first, second);
		}
		else {
			return getIntersection(Math.abs(diffOfSizes), second, first);
		}
		
	}
	
	private static boolean getIntersection(int diff, Node biggerHead, Node smallerHead){
		if(biggerHead == null || smallerHead == null)
			return false;
		// advance the bigger head by diff number
		for(int i=0; i< diff; i++){
			biggerHead = biggerHead.next;
		}
		// check corresponding elements and return true if there is a match
		while(null != biggerHead && null != smallerHead){
			if(biggerHead.equals(smallerHead))
				return true;
			biggerHead = biggerHead.next;
			smallerHead = smallerHead.next;
		}
			
		return false;
	}
}
