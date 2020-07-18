package com.custom.dataStructures;

import com.exceptions.StackOverflowException;
import com.exceptions.StackunderFlowException;

public class ModifiedStack {
		
		private int top;
		private int startIndex;
		private int endIndex;
		private int[] arr;
		
		// note: indexes start from 0
		
		public ModifiedStack(int start, int end, int[] arr){
			this.startIndex = start;
			this.endIndex = end;
			this.arr = arr;
			top = -1;
		}

		public void push(int data) {
			if(top == endIndex){
				System.out.println("StackOverflow case..");
				 throw new StackOverflowException("Stacoverflow exception caused while data insertion..");
			}
			if(data == -1){
				System.out.println("Invalid data");
				return;
			}
			++top;
			arr[top] = data;
		}
		
		public int pop() {
			if(top < startIndex){
				System.out.println("StackUnderflow case..");
				throw new StackunderFlowException("Stackunderflow caused while pop operation..");
			}
			return arr[top--];
		}
		
		public int peek(){
			if(top == -1)
				return -1;
			return arr[top];
		}
	}