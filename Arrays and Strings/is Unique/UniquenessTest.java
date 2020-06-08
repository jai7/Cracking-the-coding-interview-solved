package com.chapter.arraysandstrings;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class UniquenessTest {

	@Test
	public void test() {
		assertEquals(true, Uniqueness.isUnique("distinct"));
		assertThat(Uniqueness.isUnique("similar"), is(false));
	}
	
	@Test
	public void testBySorting() {
		assertThat(Uniqueness.isUniqueBySorting("distinct"), is(true));
		assertThat(Uniqueness.isUniqueBySorting("similar"), is(false));
	}
	
	@Test
	public void testWithAdditionalDS() {
		assertThat(Uniqueness.isUniqueUsingDS("hello"), is(true));
		assertThat(Uniqueness.isUniqueUsingDS(""), is(false));
	}

}
