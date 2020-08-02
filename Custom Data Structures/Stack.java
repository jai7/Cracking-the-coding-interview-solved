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
	
	public StackNode<T> peek(){
		return this.top;
	}
	
	public static <U> void printStack(Stack<U> st){
		StackNode<U> node = st.peek();
		while(null!=node){
			System.out.println(node.getData());
			node = node.next;
		}
	}
}
