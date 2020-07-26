package com.custom.dataStructures;

public class StackNode<T> {
	T data;
	StackNode<T> next;

	public StackNode(T data) {
		this.data = data;
		this.next = null;
	}
	public T getData(){
		return this.data;
	}
	public StackNode<T> getNext(){
		return this.next;
	}
}
