package com.custom.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOfStacks{
	private int MAX_SIZE;
	private List<Stack> sets;
	
	public SetOfStacks(int size){
		this.MAX_SIZE = size;
		this.sets = new ArrayList<Stack>();
	}
	
	public class Stack {
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
		private int size;
		
		public Stack(){
			this.top = null;
			this.size = 0;
		}

		public void push(int data) {
			StackNode node = new StackNode(data);
			node.next = this.top;
			this.top = node;
			++size;
		}
		
		public int pop() {
			if (this.top == null)
				return -1;
			StackNode node = top;
			top = top.next;
			return node.getData();
		}

		public int peek() {
			if(this.top == null)
				return -1;
			return this.top.getData();
		}
		
		public int getSize(){
			return this.size;
		}
	}
	public void push(int data){
		// if sets is null, initialize new list.
		Stack currStack;
		if(sets.size() > 0 && sets.get(sets.size()-1).getSize()<MAX_SIZE){
			currStack = sets.get(sets.size()-1);
			currStack.push(data);
		} else {
			// individual stack limit overflow or none, so create new and push
			currStack = new Stack();
			currStack.push(data);
			sets.add(currStack);
		}
	}
	
	public int pop(){
		if(sets.size()<0){
			System.out.println("SetofStacks underflow exception");
			return -1;
		}
		Stack currStack = sets.get(sets.size()-1);
		return currStack.pop();
	}
	
	public int popAtIndex(int index){
		if(sets.size()<0 || index >= sets.size()){
			System.out.println("SetofStacks underflow exception");
			return -1;
		}
		Stack currStack = sets.get(index);
		return currStack.pop();
	}
	
	public int getSize(){
		return this.sets.size();
	}
}