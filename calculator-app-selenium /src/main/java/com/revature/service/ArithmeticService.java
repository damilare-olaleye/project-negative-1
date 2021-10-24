package com.revature.service;

public class ArithmeticService {

	public String doAddition(String firstNumberString, String secondNumberString) {

		double firstNumber = Double.parseDouble(firstNumberString);
		double secondNumber = Double.parseDouble(secondNumberString);
		double sum = firstNumber + secondNumber;

		String result = "" + sum;

		return result;
	}

	public String doSubtract(String firstNumberString, String secondNumberString) {

		double firstNumber = Double.parseDouble(firstNumberString);
		double secondNumber = Double.parseDouble(secondNumberString);
		double subtract = firstNumber - secondNumber;

		String result = "" + subtract;

		return result;
	}

	public String doDivide(String firstNumberString, String secondNumberString) {

		double firstNumber = Double.parseDouble(firstNumberString);
		double secondNumber = Double.parseDouble(secondNumberString);
		double divide = firstNumber / secondNumber;

		String result = "" + divide;

		return result;
	}

	public String doMultiply(String firstNumberString, String secondNumberString) {

		double firstNumber = Double.parseDouble(firstNumberString);
		double secondNumber = Double.parseDouble(secondNumberString);
		double multiply = firstNumber * secondNumber;

		String result = "" + multiply;

		return result;
	}

	public String doMod(String firstNumberString, String secondNumberString) {

		double firstNumber = Double.parseDouble(firstNumberString);
		double secondNumber = Double.parseDouble(secondNumberString);
		double mod = firstNumber % secondNumber;

		String result = "" + mod;

		return result;
	}

}
