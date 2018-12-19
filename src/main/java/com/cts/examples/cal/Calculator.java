package com.cts.examples.cal;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		int target = -5;
		int num = 3;

		target =- num;  // Noncompliant; target = -3. Is that really what's meant?
		return a + b;  
	}
	 
	public int subtraction(int a, int b) {
	  	return a - b;
	}
	 
	public int multiplication(int a, int b) {
		 
		return a * b;
	}

	public int divison(int a, int b)  {
		
		return a / b;
	}
	 
	public boolean equalIntegers(int a, int b) {
		boolean result = false;
            	if (a == b) {
			result = true;
		}
 
		return result;
	}
}
