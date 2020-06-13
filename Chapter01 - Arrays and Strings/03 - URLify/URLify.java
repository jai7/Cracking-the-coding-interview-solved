package com.chapter.arraysandstrings;

import java.util.Scanner;

import com.util.Util;

public class URLify {
	private static final String replaceWord = "%20";

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String inputString = sc.nextLine();
			if (Util.checkIsEmpty(inputString)) {
				System.out.println(" The provided input is empty");
			} else {
				String output = uRLifyByRegex(inputString);
				System.out.println("The url form of " + inputString + " is " + output);
			}
		} catch (Exception ex) {
			System.out.println("Exception due to .." + ex.getMessage());
		} finally {
			if (null != sc) {
				sc.close();
			}
		}

	

	}

	public static String getURLify(String inputString) {
		String[] inputChars = inputString.trim().split("");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<inputChars.length;i++){
			if(Util.checkIsEmpty(inputChars[i])){
				sb.append(replaceWord);
			} else {
				sb.append(inputChars[i]);
			}
		}
		return sb.toString();
	}
	
	public static String uRLifyByRegex(String inputString) {
		return inputString.trim().replaceAll("\\s", replaceWord);
	}

}
