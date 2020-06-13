package com.chapter.arraysandstrings;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.custom.dataStructures.Tuple2;

public class PalindromePermutationTest {

	@Test
	public void test() {
		String input1 = "Cact Tao";
		Tuple2<List<Character>, Integer> test1 = PalindromePermutation.buildListCountPair(input1);
		String input2 = "abc Dea";
		Tuple2<List<Character>, Integer> test2 = PalindromePermutation.buildListCountPair(input2);
		assertThat(PalindromePermutation.doesListContainsPalindrome(test1.getValue1(), test1.getValue2()), is(true));
		assertThat(PalindromePermutation.doesListContainsPalindrome(test2.getValue1(), test2.getValue2()), is(false));
	}

}
