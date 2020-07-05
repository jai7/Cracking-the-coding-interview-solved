package com.chapter.arraysandstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.custom.dataStructures.Tuple2;
import com.util.Util;

public class PalindromePermutation {
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String input = sc.nextLine();
			if (!Util.checkIsEmpty(input)) {
				Tuple2<List<Character>, Integer> pairObj = buildListCountPair(input);
				System.out.println(String.format("Given input string %s, %s form palindrome permutation", input, doesListContainsPalindrome(pairObj.getValue1(),pairObj.getValue2()) ? "can" : "cannot"));
			} else {
				System.out.println("Please provide a valid input");
			}
		} catch (Exception ex) {
			System.out.println("Exception due to .." + ex.getMessage());
		} finally {
			if (null != sc) {
				sc.close();
			}
		}

	}
	
	public static Tuple2<List<Character>, Integer> buildListCountPair(String input){
		input = input.trim().toLowerCase();
		List<Character> charsList  = new ArrayList<Character>();
		int countOfCharacters = 0;
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)==' '){
				continue;
			}
			if(!charsList.contains(input.charAt(i))){
				charsList.add((Character)input.charAt(i));
			} else{
				charsList.remove((Character)input.charAt(i));
			}
			++countOfCharacters;
		}
		return new Tuple2<List<Character>, Integer>(charsList,countOfCharacters);
	}
	
	public static boolean doesListContainsPalindrome(List<Character> listOfChars, int count){
		if((count%2==0 && listOfChars.isEmpty()) || 
				(count%2==1 && listOfChars.size()==1)){
			return true;
		}
		return false;
	}
}
