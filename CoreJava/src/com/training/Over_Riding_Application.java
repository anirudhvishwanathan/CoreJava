package com.training;

public class Over_Riding_Application {
	
	public final static void main(String[] args){
	
		LifeInsurance inst1 = new LifeInsurance(1252,"aman","qtr",6000);
		LifeInsurance inst2 = new LifeInsurance(1252,"aman","qtr",6000);
		
		LifeInsurance inst3 = inst1;
		
		System.out.println("exact value" + inst1.equals(inst2));
		System.out.println("identity" + inst1.equals(inst3));
		String s = new String("Hello");
		
		
		
	}
	
}
