package com.custom.dataStructures;

public class SortedStack<T> {
	
	private StackNode<T> top;
	private Stack<T> buffer;
	
	SortedStack(){
		this.top = null;
		this.buffer = null;
	}

	public void push(T data) {
		// here write compare logic.
		// while stack is not empty
		// if top of stack is less than incoming, then pop & push to buffer.
		// else if top is greater than incoming, then push to stack and break;
		// if buffer is not empty, then pop & push all to stack.
		while(!this.isEmpty()){
			
		}
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
	
	public T peek(){
		return !this.isEmpty() ? this.top.getData() : null; 
	}
}