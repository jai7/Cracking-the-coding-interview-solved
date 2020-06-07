package com.chapter.arraysandstrings;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class UniquenessTest {

	@Test
	public void test() {
		assertEquals(true, Uniqueness.isUnique("distinct"));
	}
	
	@Test
	public void testBySorting() {
		assertThat(Uniqueness.isUniqueBySorting("distinct"), is(true));
	}

}
