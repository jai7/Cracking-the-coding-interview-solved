package com.chapter.stacksandqueues;

import com.custom.dataStructures.QueueOfStacks;

public class QueueUsingStack {
	
	public static void main(String[] args) {
		try{
			QueueOfStacks qSt = new QueueOfStacks();
			System.out.println("Implementation of queue using two stacks begin here..");
			qSt.enqueue(2);
			qSt.enqueue(0);
			System.out.println("dequeued data is " + qSt.dequeue()); // expected is 2
			qSt.enqueue(1);
			qSt.enqueue(6);
			qSt.enqueue(3);
			qSt.enqueue(7);
			System.out.println("dequeued data is " + qSt.dequeue()); // expected is 0
		} catch(RuntimeException e){
			System.out.println("Error occured due to invalid operation with exception message : " + e.getMessage());
		} catch(Exception ex){
			System.out.println("Error occured due to invalid operation with exception message : " + ex.getMessage());
		}

	}
}
