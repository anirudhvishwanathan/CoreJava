package com.training;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String email;
	private long handPhone;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Customer(int customerId, String customerName, String email, long handPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.handPhone = handPhone;
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
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	
    public String showCustomer(){
    	
    	String cust = customerId + ":" + customerName + ":" + email + ":" + handPhone;
    	return cust;
    }	

}
