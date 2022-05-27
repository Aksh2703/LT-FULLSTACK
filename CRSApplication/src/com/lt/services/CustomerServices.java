package com.lt.services;

import com.lt.bean.Customer;

public class CustomerServices {
	Customer customer = new Customer();
	
	public void createCustomer(){
		System.out.println("customer is created");
	}

	public void deleteCustomer(){
		System.out.println("customer is delete");
	}

	public void updateCustomer(){
		System.out.println("customer is update");
	}

}
