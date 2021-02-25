/**
 * 
 */
package com.belong.src.service;

import java.util.ArrayList;
import java.util.List;

import com.belong.src.model.Contact;
import com.belong.src.model.Customer;
import com.belong.src.model.CustomerData;

/**
 * @author suresh
 *
 */
public class CustomerServiceImpl implements CustomerService {

	List<Customer> customers = null;

	public CustomerServiceImpl() throws Exception {
		customers = CustomerData.getCustomerData();
	}

	@Override
	public List<String> getAllPhoneNumbers() {
		List<String> numbers = new ArrayList<String>();
		for (Customer customer : customers) {
			List<Contact> contacts = customer.getContacts();
			for (Contact contact : contacts) {
				numbers.add(contact.getNumber());
			}
		}
		return numbers;
	}

	@Override
	public List<String> getCustomerPhoneNumbers(String name) {
		List<String> numbers = new ArrayList<String>();
		for (Customer customer : customers) {
			if (customer.getName().equalsIgnoreCase(name)) {
				List<Contact> contacts = customer.getContacts();
				for (Contact contact : contacts) {
					numbers.add(contact.getNumber());
				}
				break;
			}
		}
		return numbers;
	}

	@Override
	public void changeStatus(String name, String number, boolean status) {
		for (Customer customer : customers) {
			if (customer.getName().equalsIgnoreCase(name) && customer.getName().equalsIgnoreCase(number)) {
				List<Contact> contacts = customer.getContacts();
				for (Contact contact : contacts) {
					contact.setActive(status);
					break;
				}
			}
		}
	}

}
