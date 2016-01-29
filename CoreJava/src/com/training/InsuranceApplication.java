package com.training;

import java.util.Scanner;

public class InsuranceApplication {

	public static void main(String[] args) {
	   LifeInsurance inst1 = new LifeInsurance();
	   
	   //Instance Variable has a default value
	   System.out.println(inst1.calculate());
	   
	   //using parametarized constructor 
	   LifeInsurance inst2 = new LifeInsurance(98588,"anirudh","QTR",60000);
	   System.out.println(inst2.calculate());
	   
	   //using wrapper class
	   long policyNumber = Long.parseLong(args[0]);
	   double policyAmount = Double.parseDouble(args[3]);
	   
	   LifeInsurance inst3 = new LifeInsurance(policyNumber,args[1],args[2],policyAmount);
	   System.out.println(inst3.calculate());
	   
	   //Using scanner class
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter policy number");
	   long policyNumber1 = sc.nextLong(); 
	   
	   System.out.println("enter policy holder name");
	   String policyHolderName2 = sc.next();
	   
	   System.out.println("enter payment mode ");
	   String paymentMode2 = sc.next();
	   
	   System.out.println("enter policy Amount ");
	   double policyAmount2 = sc.nextDouble();
	   
	   LifeInsurance inst4 = new LifeInsurance(policyNumber1,policyHolderName2,paymentMode2,policyAmount2);
	   System.out.println(inst4.calculate(policyAmount2));
	   
	   sc.close();
	   
	}

}
