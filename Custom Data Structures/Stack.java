package com.custom.dataStructures;

public class Stack<T> {
	
	private StackNode<T> top;

	public void push(T data) {
		StackNode<T> node = new StackNode<T>(data);
		node.next = this.top;
		this.top = node;
	}
	
	public StackNode<T> pop() {
		if (this.top == null)
			return null;
		StackNode<T> node = top;
		top = top.next;
		return node;
	}
	
	public boolean isEmpty(){
		return this.top == null;
	}
}
