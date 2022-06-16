package com.org.springboot.rediscache.service;

import com.org.springboot.rediscache.pojo.Customer;

public interface CustomerService {

	public Customer getCustomerById(String id);

}
