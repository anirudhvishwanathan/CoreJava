package com.training;

public class InsuranceManagerApplication {

	public static void main(String[] args) {
		LifeInsurance inst1 = new LifeInsurance(101,"Ramit","qtr",45000);
		LifeInsurance inst2 = new LifeInsurance(102,"Shubham","hlf",46000);
		LifeInsurance inst3 = new LifeInsurance(103,"anirudh","ann",47000);
		LifeInsurance inst4 = new LifeInsurance(104,"aman","qtr",48000);
		
		LifeInsurance[] list = new LifeInsurance[4];
		list[0] = inst1;
		list[1] = inst2;
		list[2] = inst3;
		list[3] = inst4;
		
		//InsuranceManager mgr = new InsuranceManager();
		InsuranceManager.printPremiums(list);
	}

}
