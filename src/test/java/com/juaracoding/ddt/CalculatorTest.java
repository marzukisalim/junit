package com.juaracoding.ddt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junitparams.FileParameters;

public class CalculatorTest {
	Calculator calculator;
	int a, b;

	@Before
	public void setUp() {
		calculator = new Calculator();
		a = 10;
		b = 5;
	}
	
	@Test
	@FileParameters("src/test/resources/Untitled.csv")
	public void testCalculator() {
		int expect = 5;
		int actual = calculator.subtract(a,b);
		assertEquals(expect, actual);
	}

	@Test
	public void testAdd() {
			int expect = 15;
			int actual = calculator.add(a, b);
			assertEquals(expect, actual);
	}

//	@Test
//	public void testSubtract() {
//		fail("Not yet implemented");
//	}

}
