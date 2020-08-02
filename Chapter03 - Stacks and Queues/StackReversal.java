package com.chapter.stacksandqueues;

import com.custom.dataStructures.Stack;
import com.custom.dataStructures.StackNode;

public class StackReversal {
	
	static Stack<Integer> reverseStack = new Stack<Integer>();
	public static void main(String[] args) {
		// this program is to reverse a stack using recursion
		reverseStack.push(11);
		reverseStack.push(7);
		reverseStack.push(4);
		reverseStack.push(3);
		reverseStack.push(2);
		reverse();
		Stack.printStack(reverseStack);
	}
	
	static void reverse(){
		// the idea is to pop all elements from stack and maintain in function stack
		// then push these elements at the bottom of the stack.
		if(!reverseStack.isEmpty()){
			StackNode<Integer> temp = reverseStack.pop();
			reverse();
			insertAtBottom((int)temp.getData());
		}
	}

	static void insertAtBottom(int data) {
		// TODO Auto-generated method stub
		if(reverseStack.isEmpty()){
			reverseStack.push(data);
		} else {
			int temp = reverseStack.pop().getData();
			insertAtBottom(data);
			reverseStack.push(temp);
		}
	}

}
