package com.chapter.stacksandqueues;

import com.custom.dataStructures.ModifiedStack;
import com.exceptions.StackOverflowException;
import com.exceptions.StackunderFlowException;

public class ThreeInOneArray {

	public static void main(String[] args) {
		int[] jointArray = new int[10];
		
		try{
		// populate array with -1 for initial state.
		for(int i=0; i<jointArray.length; i++){
			jointArray[i] = -1;
		}
		ModifiedStack stack1 = new ModifiedStack(0,3,jointArray);
		ModifiedStack stack2 = new ModifiedStack(4,6,jointArray);
		ModifiedStack stack3 = new ModifiedStack(7,9,jointArray);
		
		// Stack Operations
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		System.out.println(stack1.pop());
		System.out.println(stack2.peek() == -1 ? "Given stack is empty" : stack1.peek());
		} catch(StackOverflowException | StackunderFlowException e){
			System.out.println("");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
