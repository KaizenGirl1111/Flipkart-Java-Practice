/**
 * 
 */
package com.flipkart.business;

/**
 * @author Dell
 *
 */
public class CustomerBusiness {

	// All Cuatromers MEthods here
	// Create update delete list

	public void createCustomer() {

		System.out.println("Customer is created -->");
	}

	public boolean deleteCustomer(int customerID) {

		System.out.println("Customer is Deleted by id -->" + customerID);
		return true;
	}

	public boolean updateCustomer(int customerID) {

		System.out.println("Customer is update by id -->" + customerID);
		return true;
	}
	
	 public void listCustomer() {
		 
		 System.out.println("listed Customer here -->");
	 }

}