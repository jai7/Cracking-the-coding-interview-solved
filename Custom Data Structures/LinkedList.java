package com.custom.dataStructures;

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
	
	public static Optional<Node> elementAtPos(Node head, int pos){
		Node temp = head;
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
}
