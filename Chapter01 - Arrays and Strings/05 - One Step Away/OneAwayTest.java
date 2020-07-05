package com.chapter.arraysandstrings;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class OneAwayTest {

	@Test
	public void test() {
		assertThat(OneAway.isOneStepAway("reader", "reaer"), is(true));
		assertThat(OneAway.isOneStepAway("reader", "tender"), is(false));
		assertThat(OneAway.isOneStepAway("reader", "reber"), is(false));
		assertThat(OneAway.isOneStepAway("reader", ""), is(false));
		assertThat(OneAway.isOneStepAway("   ", "asdf"), is(false));
		assertThat(OneAway.isOneStepAway("bsdf", "asdf"), is(true));
	}

}
