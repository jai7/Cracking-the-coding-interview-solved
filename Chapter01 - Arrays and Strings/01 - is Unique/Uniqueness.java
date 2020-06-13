package com.chapter.arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import com.util.*;


public class Uniqueness{

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String checkStr = sc.nextLine();
			if (Util.checkIsEmpty(checkStr)) {
				System.out.println(checkStr + (isUnique(checkStr) ? " is unique" : " is not unique"));
			} else {
				System.out.println("Provided input is empty");
			}
		} catch (Exception ex) {
			System.out.println("Exception due to .." + ex.getMessage());
		} finally {
			if (null != sc) {
				sc.close();
			}
		}
	}
	
	public static boolean isUnique(String checkStr) {
		List<String> check = Arrays.asList(checkStr.split(""));
		String distinctStr = check.stream().distinct().collect(Collectors.joining());
		return distinctStr.length() == checkStr.length();
	}
	
	public static boolean isUniqueBySorting(final String checkStr) {
		List<String> testStr = Arrays.asList(checkStr.split(""));
		testStr.sort(Util.compareStrings);
		Optional<String> result = testStr
				.stream().filter(str -> checkStr.indexOf(str) != checkStr.lastIndexOf(str))
				.findFirst();
		return !result.isPresent();
	}
	
	public static boolean isUniqueUsingDS(String checkStr){
		Map<Character,Integer> frequencyMap = new HashMap<Character, Integer>();
		for(int i=0; i<checkStr.length(); i++){
			if(!frequencyMap.containsKey(checkStr.charAt(i))){
				return false;
			}
			frequencyMap.put(checkStr.charAt(i), 1);
		}
		return true;
	}
}