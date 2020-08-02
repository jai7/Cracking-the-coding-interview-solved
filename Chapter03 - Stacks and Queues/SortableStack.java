package com.chapter.stacksandqueues;

import com.custom.dataStructures.Stack;
import com.custom.dataStructures.StackNode;

public class SortableStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		// fill stack with random elements
		st.push(30);
		st.push(10);
		st.push(6);
		st.push(11);
		st.push(2);
		st.push(21);
		System.out.println("Before sorting stack elements :");
		Stack.printStack(st);
		sortUsingRecursion(st);
		System.out.println("After sorting stack elements :");
		Stack.printStack(st);
	}
	
	static void sort(Stack<Integer> s){
		Stack<Integer> buffer = new Stack<Integer>();
		// idea is to get the smallest element encountered so far in buffer stack
		// pop an element from stack s, and check if any in buffer such that buffer.peek > popped element then push it back to stack s push popped element to buffer
		while(!s.isEmpty()){
			StackNode<Integer> temp = s.pop();
			while(!buffer.isEmpty() && null!= buffer.peek() && buffer.peek().getData()>temp.getData()){
				s.push(buffer.pop().getData());
			}
			buffer.push(temp.getData());
		}
		
		// once iteration is complete, push back all elements from buffer to stack
		while(!buffer.isEmpty()){
			s.push(buffer.pop().getData());
		}
	}

	
	static void sortUsingRecursion(Stack<Integer> stack){
		// the idea is to pop all elements from stack and maintain in function stack
		// then push these elements into stack below current element if it is lower else above it.
		if(!stack.isEmpty()){
			StackNode<Integer> temp = stack.pop();
			sortUsingRecursion(stack);
			sortedInsert(stack, (int)temp.getData());
		}
	}

	static void sortedInsert(Stack<Integer> stack, int data) {
		if(stack.isEmpty() || data > stack.peek().getData()){
			stack.push(data);
		} else {
			int temp = stack.pop().getData();
			sortedInsert(stack, data);
			stack.push(temp);
		}
	}
}
