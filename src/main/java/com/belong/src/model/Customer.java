package com.belong.src.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author suresh
 *
 */
@Data
public class Customer { 

 @Setter @Getter
 private String name;
 @Setter @Getter
 private List<Contact> contacts;  
}
