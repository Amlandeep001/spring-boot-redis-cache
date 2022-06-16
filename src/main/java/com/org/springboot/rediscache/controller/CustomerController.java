package com.org.springboot.rediscache.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.rediscache.pojo.Customer;
import com.org.springboot.rediscache.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Resource
    CustomerService customerService;
	
	@GetMapping("customer/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomerById(id);
	}
     
     
	
}
