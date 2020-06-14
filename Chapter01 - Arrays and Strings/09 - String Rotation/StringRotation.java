package com.chapter.arraysandstrings;

public class StringRotation {

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for(String[] pair: pairs){
			String first = pair[0];
			String second = pair[1];
			System.out.println(String.format("%s is rotation of %s " + isRotation(second,first) , first,second));
		}

	}
	
	static boolean isRotation(String st1, String st2){
		int len = st1.length();
		if(len == st2.length() && len > 0){
			String st1Twice = st1 + st1;
			return isSubstring(st1Twice, st2);
		}
		return false;
	}

	static boolean isSubstring(String st1Twice, String st2) {
		return st1Twice.indexOf(st2)!=-1 ? true : false;
	}

}
