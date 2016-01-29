package com.training;

public class TestDollar {

	public static void main(String[] args) {
		
		CurrencyConverter c = new CurrencyConverter();
		double dollar_amt = 2.0;
		double result = c.dollarToInr(dollar_amt);
		System.out.println("The value of" + dollar_amt + "$ to Indian Rupees is:"+ result);
		System.out.println(result);

	}

}
