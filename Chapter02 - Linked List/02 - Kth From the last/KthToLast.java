package com.chapter.linkedlists;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;
import com.custom.dataStructures.Tuple2;

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
		Scanner sc = null;
		int k = 0;
		int value = -1;
		try{
			sc = new Scanner(System.in);
			System.out.println("Enter the index to be checked from last: ");
			k = sc.nextInt();
		} catch(Exception ex){
			System.out.println("Exception due to " + ex.getMessage());
		} finally {
			if(null != sc){
				sc.close();
			}
		}
		// get kth from the last element data in the linked list
		if(k != 0)
			value = getKthLastValue(list.head, k);
		System.out.format("The %d value from the last is %d", k , value);
		
	}
	
	public static int getKthLastValue(Node head, int posFromEnd){
//		int lenOfList = LinkedList.findListLength(head);
		Tuple2<Map, Integer> tuple = getMapOfNodesAndLength(head);
		int lenOfList = tuple.getValue2();
		int posFromStart = lenOfList - posFromEnd + 1;
//		Optional<Node> node = LinkedList.elementAtPos(head, posFromStart);
//		return node.isPresent() ? (int)node.get().getData(): -1;
		return (posFromStart>0 && posFromStart<lenOfList) ? (int)tuple.getValue1().get(Integer.valueOf(posFromStart)) : -1;
	}
	
	public static Tuple2<Map, Integer> getMapOfNodesAndLength(Node<Integer> head){
		Node<Integer> temp = head;
		int index = 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(null != temp){
			map.put(Integer.valueOf(index), temp.getData());
			++index;
			temp = temp.next;
		}
		return new Tuple2<Map, Integer>(map, index-1);
	}

}
