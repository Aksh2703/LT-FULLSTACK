package com.lt.application;

import com.lt.bean.Customer;
import com.lt.services.CustomerServices;

public class Application {

	public static void main(String[] args) {
		Customer customer= new Customer();
         customer.setCustomerId(101);
         customer.setCustomerName("Akshay");
         customer.setCustomerAddress("Chandrapur");
         
         CustomerServices cs= new CustomerServices();
        cs. createCustomer();
        cs. deleteCustomer();
        cs. updateCustomer();
	}

}
