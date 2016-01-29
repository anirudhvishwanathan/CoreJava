package com.training;

public class InsuranceManager {

	public static void printPremiums(LifeInsurance[] policies) {
		for(LifeInsurance inst: policies)
		{
			System.out.println(inst);
			System.out.println("premium := " + inst.calculate());
		}
	
	}
}
