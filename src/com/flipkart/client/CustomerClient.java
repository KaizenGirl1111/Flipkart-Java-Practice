/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;

/**
 * @author Dell
 *
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entry Point of the Application with Public static void main 
		
		CustomerBusiness service =new CustomerBusiness();
		service.createCustomer();
		System.out.println("delete Customer-->" +service.deleteCustomer(101));
		System.out.println("Update Customer-->" +service.updateCustomer(101));
		service.listCustomer();
		
		

	}

} 