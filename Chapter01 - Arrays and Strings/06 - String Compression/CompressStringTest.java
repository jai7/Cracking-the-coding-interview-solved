package com.chapter.arraysandstrings;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class CompressStringTest {

	@Test
	public void test() {
		assertThat(CompressString.compress("aaaasssddf"), is("a4s3d2f1"));
		assertThat(CompressString.compress("  "), is("Not a valid string"));
		assertThat(CompressString.compress("aassdf"), is("aassdf"));
	}

}
