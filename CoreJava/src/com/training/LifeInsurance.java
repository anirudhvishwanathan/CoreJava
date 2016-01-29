package com.training;

public class LifeInsurance {
private long policyNumber;
private String policyHolderName;
private String paymentMode;
private double policyAmount;

//static block
static{
	System.out.println("static block called");
}

//initialization block
{
	System.out.println("initialization block called");
}


public LifeInsurance() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("constructor called");
}


public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount) {
	super();
	this.policyNumber = policyNumber;
	this.policyHolderName = policyHolderName;
	this.paymentMode = paymentMode;
	this.policyAmount = policyAmount;
	System.out.println("parametarized constructor called");
}


public long getPolicyNumber() {
	return policyNumber;
}


public void setPolicyNumber(long policyNumber) {
	this.policyNumber = policyNumber;
}


public String getPolicyHolderName() {
	return policyHolderName;
}


public void setPolicyHolderName(String policyHolderName) {
	this.policyHolderName = policyHolderName;
}


public String getPaymentMode() {
	return paymentMode;
}


public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}


public double getPolicyAmount() {
	return policyAmount;
}


public void setPolicyAmount(double policyAmount) {
	this.policyAmount = policyAmount;
}

public double calculate() {
	return this.policyAmount *.10;
}

//overloaded method
public double calculate(double policyAmt){
	double amount = policyAmt *.10;
	double discount = amount *.15;
	double netAmount = amount - discount;
	return netAmount;
}

//overriding
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.policyNumber + ":" + this.policyHolderName;
}


@Override
public int hashCode() {
	// TODO Auto-generated method stub
long code = this.policyNumber + 7 * policyNumber;
return (int)code;
}


@Override
public boolean equals(Object obj) {
	//checking for identity
	if (this == obj) return true;
	//cautious
	if (obj == null) return false;
	// checking the type of object
	if(this.getClass()!=obj.getClass()) return false;
	//casting
	LifeInsurance inst = (LifeInsurance) obj;
	//checking the condition
	return policyNumber == inst.policyNumber &&
		   policyHolderName.equals(inst.policyHolderName);
	
	
}



}
