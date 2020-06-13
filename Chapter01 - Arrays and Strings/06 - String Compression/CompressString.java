package com.chapter.arraysandstrings;

import java.util.Scanner;

import com.util.Util;

public class CompressString {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String input = sc.nextLine();
			System.out.println(compress(input));
		} catch (Exception ex) {
			System.out.println("Exception due to .." + ex.getMessage());
		} finally {
			if (null != sc) {
				sc.close();
			}
		}

	}
	
	static String compress(String input){
		if(Util.checkIsEmpty(input)){
			return "Not a valid string";
		}
		StringBuilder sb = new StringBuilder();
		char[] inputChars = input.toCharArray();
		int count = 0;
		for(int i=0;i<inputChars.length;i++){
			++count;
			if(i+1 >= inputChars.length || inputChars[i]!=inputChars[i+1]){
				sb.append(inputChars[i]).append(count);
				count = 0;
			}
		}
		return input.length()<sb.length() ? input : sb.toString();
	}

}
