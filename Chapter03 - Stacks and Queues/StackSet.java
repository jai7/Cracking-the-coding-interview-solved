package com.chapter.stacksandqueues;

import com.custom.dataStructures.SetOfStacks;

public class StackSet {

	public static void main(String[] args) {
		SetOfStacks setOfPlates = new SetOfStacks(3);
		setOfPlates.push(4);
		setOfPlates.push(1);
		setOfPlates.push(6);
		setOfPlates.push(3);
		setOfPlates.push(7);
		setOfPlates.push(2);
		setOfPlates.push(8);
		setOfPlates.push(5);
		System.out.println("No of stacks in set is : " + setOfPlates.getSize());
		System.out.println(setOfPlates.pop());
		System.out.println("removed top element in 1st stack is : " + setOfPlates.popAtIndex(0));
	}

}
