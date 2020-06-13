package com.chapter.arraysandstrings;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class URLifyTest {

	@Test
	public void testUrlify() {
		assertThat(URLify.getURLify("Mr John Smith  "), is("Mr%20John%20Smith"));
		assertThat(URLify.getURLify(" Mr  Peter Parker"), is("Mr%20%20Peter%20Parker"));
	}
	
	@Test
	public void testUrlifyByRegex() {
		assertThat(URLify.uRLifyByRegex("Mr John Smith  "), is("Mr%20John%20Smith"));
		assertThat(URLify.uRLifyByRegex(" Mr  Peter Parker"), is("Mr%20%20Peter%20Parker"));
	}

}
