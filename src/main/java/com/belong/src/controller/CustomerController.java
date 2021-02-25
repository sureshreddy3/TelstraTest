
package com.belong.src.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.belong.src.service.CustomerService;

/**
 *
 * @author Suresh
 */
@RestController

public class CustomerController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/getAllPhoneNumbers")
    public ResponseEntity<Object> getAllPhoneNumbers() {
	   logger.debug("This is a debug message");
       return new ResponseEntity<>(customerService.getAllPhoneNumbers(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/getCustomerPhoneNumbers")
    public ResponseEntity<Object> getCustomerPhoneNumbers(@PathVariable("name") String name) {
       return new ResponseEntity<>(customerService.getCustomerPhoneNumbers(name), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{name}/{number}/{status}", method = RequestMethod.PUT)
    public ResponseEntity<Object> 
    changeStatus(@PathVariable("name") String name, @PathVariable("number") String number,@PathVariable("status") boolean status) {
       customerService.changeStatus(name, number, status);
       return new ResponseEntity<>("Customer is updated successsfully", HttpStatus.OK);
    }
}
