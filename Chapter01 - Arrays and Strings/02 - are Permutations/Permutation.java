package com.chapter.arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.util.Util;

public class Permutation {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String firstString = sc.nextLine();
			String secondString = sc.nextLine();
			if ((Util.checkIsEmpty(firstString) || Util.checkIsEmpty(secondString))) {
				System.out.println("One or both of the provided inputs is empty");
			} else {
				if (firstString.length() == secondString.length()) {
					System.out.println(
							firstString + " " + secondString + (isPermutationBySorting(firstString, secondString)
									? " are permutations" : " are not permutations"));
				} else {
					System.out.println(firstString + " " + secondString + " are not permutations");
				}
			}
		} catch (Exception ex) {
			System.out.println("Exception due to .." + ex.getMessage());
		} finally {
			if (null != sc) {
				sc.close();
			}
		}

	}
	
	static boolean isPermutationBySorting(String first, String second) {
		List<String> listOfFirst = Arrays.asList(first.split(""));
		List<String> listOfSecond = Arrays.asList(second.split(""));
		listOfFirst.sort(Util.compareStrings);
		listOfSecond.sort(Util.compareStrings);
		for (int i = 0; i < listOfFirst.size(); i++) {
			if (!listOfFirst.get(i).equals(listOfSecond.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isPermutationByExtraDS(String first, String second) {
		Map<Character, Integer> frequencyStr = new HashMap<Character, Integer>();
		for (int i = 0; i < first.length(); i++) {
			if (frequencyStr.containsKey(first.charAt(i))) {
				frequencyStr.put(first.charAt(i), frequencyStr.get(first.charAt(i)) + 1);
			} else {
				frequencyStr.put(first.charAt(i), 1);
			}
		}

		for (int j = 0; j < second.length(); j++) {
			if (!frequencyStr.containsKey(second.charAt(j))) {
				return false;
			}
			frequencyStr.put(second.charAt(j), frequencyStr.get(second.charAt(j)) - 1);
		}

		Iterator<Entry<Character, Integer>> iterator = frequencyStr.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			if (entry.getValue() != 0)
				return false;
		}

		return true;
	}


}
