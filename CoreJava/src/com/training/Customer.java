package com.training;

import com.training.myexception.RangeCheckException;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String email;
	private long handPhone;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
//declare rule	
	public Customer(int customerId, String customerName, String email, long handPhone) throws RangeCheckException  {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		if(handPhone>9 || handPhone<1) {
			 throw new RangeCheckException(handPhone);
		}
		else
		{
		this.handPhone = handPhone;
	}
}



	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getHandPhone() {
		return handPhone;
	}

	
//handle rule	
	public void setHandPhone(long handPhone) {
	if(handPhone>9 || handPhone<1)
	{
		try {
			
			throw new RangeCheckException(handPhone);	
		} catch (RangeCheckException e)
		{
			System.out.println(e.getMessage());
		}
	}
	else
	{
		
		this.handPhone = handPhone;
	}
}
	
    public String showCustomer(){
    	
    	String cust = customerId + ":" + customerName + ":" + email + ":" + handPhone;
    	return cust;
    }	

}
