package com.cts.examples.cal;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
	     return a + b;  
	}
	 
	public int subtraction(int a, int b) {
		
	  	return a - b;
	}
	 
	public int multiplication(int a, int b) {
		 String.format("%< is equals to %d", 2);   //Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
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
