package com.belong.src.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suresh
 *
 */
public class CustomerData {
	
	public static List<Customer> customers = null;

	static {
		customers = new ArrayList<Customer>();
		List<Contact> contacts = new ArrayList<Contact>();
		Customer cust = new Customer();
		Contact cont = new Contact();
		cont.setNumber("0400000000");
		cont.setActive(false);
		contacts.add(cont);
		cont.setNumber("0400000001");
		cont.setActive(true);
		cust.setContacts(contacts);
		cust.setName("customer1");
		customers.add(cust);
		cust = new Customer();
		cont = new Contact();
		cont.setNumber("0400000003");
		cont.setActive(false);
		contacts.add(cont);
		cont.setNumber("0400000004");
		cont.setActive(true);
		cust.setContacts(contacts);
		cust.setName("customer2");
		customers.add(cust);
		}

	public static List<Customer> getCustomerData() throws Exception {
			System.out.println(customers.toString());
			return customers;
	}
	
	public static void main(String args[]) {
		try {
			CustomerData.getCustomerData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
