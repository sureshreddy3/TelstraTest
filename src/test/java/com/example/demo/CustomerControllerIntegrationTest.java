package com.example.demo;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.belong.src.controller.CustomerController;
import com.belong.src.model.Contact;
import com.belong.src.model.Customer;
import com.belong.src.service.CustomerService;


@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CustomerService service;
    
    
    @Test
    public void givenCustomer_whenGetCustomers_thenReturnJsonArray()
      throws Exception {
        
        Customer cust = new Customer();
        cust.setName("Suresh");
        Contact cont = new Contact();
        cont.setActive(true);
        cont.setNumber("0400000000");
        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(cont);
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(cust);
        
        List<String> numbers = new ArrayList<String>();
        numbers.add("0400000000");
        
        mvc.perform(get("/getAllPhoneNumbers")
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(jsonPath("$", hasItems(1)));
        
      
    }

}
