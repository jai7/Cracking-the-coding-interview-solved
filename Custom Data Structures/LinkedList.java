package com.custom.dataStructures;

import java.util.Collections;
import java.util.Optional;

import com.custom.dataStructures.LinkedList.Node;

public class LinkedList {
	public Node head;
	public static class Node<T> {
		T data;
		public Node next;
		
		public Node(T data){
			this.data = data;
			this.next = null;
		}
		
		public T getData(){
			return this.data;
		}
		
	}
	
	public void printList(){
		Node temp = head;
		while(temp !=null){
			System.out.print(temp.getData());
			if(temp.next!=null){
				System.out.print("--->");
			}
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static int findListLength(Node head){
		Node temp = head;
		int i=0;
		while(null != temp){
			++i;
			temp = temp.next;
		}
		return i;
	}
	
	public static Optional<Node<Integer>> elementAtPos(Node<Integer> head, int pos){
		Node<Integer> temp = head;
		int i = 1;
		while(null != temp){
			if(i==pos){
				return Optional.of(temp);
			}
			++i;
			temp = temp.next;
		}
		return Optional.empty();
	}
	
	public static LinkedList buildLinkedList(int[] data){
		LinkedList list = new LinkedList();
		if(null != data && -1 != data[0]){
			list.head = new Node<Integer>(data[0]);
		} else {
			return null;
		}
		Node curr = list.head;
		for(int i=1; i< data.length; i++){
			curr.next = new Node<Integer>(data[i]);
			curr = curr.next;
		}
		return list;
	}
}
