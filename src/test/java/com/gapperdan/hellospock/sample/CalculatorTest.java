package com.gapperdan.hellospock.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldReturn2_whenCallingSum1and1() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.sum(1,1));
	}

}
