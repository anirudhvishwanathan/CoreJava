package com.training;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1 = new Customer();
		
		cust1.setCustomerId(145);
		cust1.setCustomerName("Ramesh");
		cust1.setEmail("ramesh@gmail.com");
        cust1.setHandPhone(92774162);
        
        Customer cust2 = new Customer(146, "Raj", "raj@abc.com", 9266172);
        
        System.out.println(cust1.showCustomer());
        System.out.println(cust2.showCustomer());
        

	}

}
