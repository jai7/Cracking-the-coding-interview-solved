package com.custom.dataStructures;

public class Stack<T> {
	public class StackNode<T> {
		T data;
		StackNode<T> next;

		StackNode(T data) {
			this.data = data;
			this.next = null;
		}
	}
	private StackNode<T> top;

	public void push(T data) {
		StackNode<T> node = new StackNode(data);
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
}
