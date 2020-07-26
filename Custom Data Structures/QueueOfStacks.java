package com.custom.dataStructures;

import com.exceptions.StackunderFlowException;

public class QueueOfStacks {
	Stack<Integer> st1 = new Stack<Integer>();
	Stack<Integer> st2 = new Stack<Integer>();

	// note assuming the stacks are of infinite capacity
	// for enqueue push all elements into stack1
	public void enqueue(int data) {
		st1.push(data);
	}

	public int dequeue() {
		// if stack1 and stack2 are empty then stack underflow exception
		// if st2 is empty and st1 is not, then iterate through st1, pop all its
		// elements and push into st2.
		// pop st2 element.
		if (st1.isEmpty() && st2.isEmpty())
			throw new StackunderFlowException("No elements in stack internal to queue to remove");
		if (st2.isEmpty()) {
			while (!st1.isEmpty()) {
				StackNode<Integer> transferEle = st1.pop();
				if (transferEle == null)
					break;
				st2.push(transferEle.getData());
			}
		}
		StackNode<Integer> popElement = st2.pop();
		return popElement != null ? popElement.getData() : -1;
	}
}
