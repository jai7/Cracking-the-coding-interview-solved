package com.custom.dataStructures;

public class MinStack {
	public class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
			this.next = null;
		}
		
		public int getData(){
			return this.data;
		}
	}
	private StackNode top;
	private int min;
	
	public MinStack(){
		this.top = null;
		this.min = -1;
	}

	public void push(int data) {
		if(this.min != -1)
			this.min = (this.min < data) ? this.min : data;
		else
			this.min = data;
		StackNode node = new StackNode(data);
		node.next = this.top;
		this.top = node;
	}
	
	public StackNode pop() {
		if (this.top == null)
			return null;
		StackNode node = top;
		top = top.next;
		return node;
	}
	
	public int min(){
		if(this.min == -1){
			System.out.println("Stack is empty..");
		}
		return this.min;
	}

	public int peek() {
		if(this.top == null)
			return -1;
		return this.top.getData();
	}
}