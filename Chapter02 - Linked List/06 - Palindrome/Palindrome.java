package com.chapter.linkedlists;

import java.util.HashMap;
import java.util.Map;
import com.custom.dataStructures.LinkedList;
import com.custom.dataStructures.LinkedList.Node;

public class Palindrome {
	public static void main(String[] args){
		int[] input = {1,2,3,3,2,1};
		LinkedList list = LinkedList.buildLinkedList(input);
		boolean isPalindrome = checkIfPalindromeUsingReversal(list.head);// better to implement it with stack, but technically we didn't come across stack concept yet so used map.
		System.out.println("Given linked list is palindrome : " + isPalindrome);
	}
	
	static boolean checkIfPalindromeUsingSet(Node head){
		Map<Integer,Integer> posValueMap = new HashMap<Integer,Integer>();
		int length = 0;
		for(int i=0; null != head; head=head.next,++i){
			posValueMap.put(Integer.valueOf(i), (Integer)head.getData());
			++length;
		}
		
		for(int j=0; j<length/2; j++){
			if(posValueMap.get(j).equals(posValueMap.get(length-j-1))){
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	static boolean checkIfPalindromeUsingReversal(Node head){
		Node temp1 = head, temp2 = head;
		Node reverse = null;
		int length = 0;
		
		while(null != temp1){
			++length;
			temp1 = temp1.next;
		}
		
		for(int j=0; null!=temp2 && j<length/2; j++){
			temp2 = temp2.next;
		}
		
		if(length%2 == 0)
		reverse = getReversalHead(temp2);
		else
		reverse = getReversalHead(temp2.next);
		
		for(int i=0; i<length/2; i++){
			if(!(null != head && null != reverse)){
				return false;
			}
			if(!head.getData().equals(reverse.getData()))
				return false;
			head = head.next;
			reverse = reverse.next;
			
		}
		
		return true;
	}
	
	static Node getReversalHead(Node temp){
		if(null == temp){
			return null;
		}
		
		Node rev = null;
		while(null != temp){
			Node tail = temp;
			temp = temp.next;
			tail.next = rev;
			rev = tail;
		}
		return rev;
	}
}
