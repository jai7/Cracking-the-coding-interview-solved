package com.chapter.arraysandstrings;

import com.util.Util;

public class OneAway {

	public static void main(String[] args) {
		String input1 = "asdf";
		String input2 = "adf";
		System.out.println("Given input strings are one edit away : " + isOneStepAway(input1, input2));
	}
	
	public static boolean isOneStepAway(String st1, String st2){
		if (Util.checkIsEmpty(st1) || Util.checkIsEmpty(st2)){
			return false;
		}
		else if(st1.length()==st2.length()){
			return isOneReplaceAway(st1, st2);
		} else if(st1.length()<st2.length()){
			return isOneInsertAway(st1, st2);
		} else {
			return isOneInsertAway(st2, st1);
		}
	}
	
	private static boolean isOneInsertAway(String st1, String st2){
		char[] firstChars = st1.toCharArray();
		char[] secondChars = st2.toCharArray();
/* 		If the order of characters occurrence is not same in inputs, then
		need to sort the strings before comparison
		sortChars(firstChars);
		sortChars(firstChars);*/
		int count = 0;
		int j = 0;
		int i = 0;
		while(i < firstChars.length && j<secondChars.length){
			if(firstChars[i]!=secondChars[j]){
				if(i!=j){
					return false;
				}
				++count;
			} else {
				++i;
			}
			++j;
		}
		
		return count > 1 ? false : true;
	}
	
	private static boolean isOneReplaceAway(String st1, String st2){
		char[] firstChars = st1.toCharArray();
		char[] secondChars = st2.toCharArray();
		int count = 0;
/*		If the order of characters occurrence is not same in inputs, then
		need to sort the strings before comparison
		sortChars(firstChars);
		sortChars(firstChars);*/
		for(int temp=0; temp<firstChars.length; temp++){
			if(firstChars[temp]!=secondChars[temp]){
				++count;
			}
		}
		return count>1 ? false : true;
	}
	
	private static void sortChars(char[] input){
		char ch;
		for(int i=0; i<input.length; i++){
			for(int j=0; j<input.length-i-1; j++){
				if(input[j]>input[j+1]){
					ch = input[j+1];
					input[j+1] = input[j];
					input[j] = ch;
					ch = Character.MIN_VALUE;
				}
			}
		}
	}
}
