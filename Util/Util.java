package com.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Util {
	public static Comparator<String> compareStrings = (String str1, String str2) -> {
		return (int)(str1.charAt(0)) - (int)(str2.charAt(0));
	}; 
	
	public static boolean checkIsEmpty(String str){
		return !(null != str && !str.trim().isEmpty());
	}
	
	public static <E> void printMatrix(E[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static <E> boolean arrHasValueUsingSet(E[] arr, E element){
		Set<E> set = new HashSet<E>(Arrays.asList(arr));
		return set.contains(element);
	}
	
	public static <E> boolean arrHasValue(E[] arr, E element){
		if(!(arr!=null && arr.length!=0))
			return false;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==element){
				return true;
			}
		}
		return false;
	}
	
}
