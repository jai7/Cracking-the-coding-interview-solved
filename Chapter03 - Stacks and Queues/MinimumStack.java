package com.chapter.stacksandqueues;

import com.custom.dataStructures.MinStack;

public class MinimumStack {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(1);
		minStack.push(2);
		minStack.push(3);
		System.out.println("min element in stack is :" + minStack.min());
		System.out.println("top element in stack is :" + minStack.peek());
		System.out.println("popped element in stack is :" + minStack.pop().getData());
	}

}
