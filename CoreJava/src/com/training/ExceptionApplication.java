package com.training;

import com.training.myexception.RangeCheckException;

public class ExceptionApplication {

	public static void main(String[] args) throws Exception {
		
		try {
			Customer cust = new Customer(146, "Raj", "raj@abc.com", 899);
		} catch (RangeCheckException e) {
			
			//throw new Exception(); next statement will become unreachable
			
			System.out.println(e.getMessage());
			
			throw new Exception();
		}
		
	finally {
		
		System.out.println("inside finally");
	}  	
		
	System.out.println("bye");	
	}
}
