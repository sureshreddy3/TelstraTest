/**
 * 
 */
package com.belong.src.service;

import java.util.List;

/**
 * @author suresh
 *
 */
public interface CustomerService {
	   public abstract List<String> getAllPhoneNumbers();
	   public abstract List<String> getCustomerPhoneNumbers(String name);
	   public abstract void changeStatus(String name,String number, boolean status);
}
