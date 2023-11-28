package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.entyties.Calculator;

class CalculatorTests {

	@Test
	public void addTwoNumbers() {

		Calculator calculator = new Calculator();
		int sum = calculator.sum(10, 5);
		Assertions.assertEquals(15, sum);
	}

	
	@Test
	public void checkPair() {
		Calculator calculator = new Calculator();
		boolean check = calculator.checkPair(6);
		Assertions.assertTrue(check);
	}
}
