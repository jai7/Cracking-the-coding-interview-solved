package com.custom.dataStructures;

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
}
