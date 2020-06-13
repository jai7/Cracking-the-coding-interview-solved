package com.chapter.arraysandstrings;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {
	
	@Test
	public void testBySorting() {
		assertThat(Permutation.isPermutationBySorting("asdffd", "fdsafd"), is(true));
		assertThat(Permutation.isPermutationBySorting("letter", "retter"), is(false));
	}
	
	@Test
	public void testWithAdditionalDS() {
		assertThat(Permutation.isPermutationByExtraDS("asdffd", "fdsafd"), is(true));
		assertThat(Permutation.isPermutationByExtraDS("letter", "retter"), is(false));
	}

}
