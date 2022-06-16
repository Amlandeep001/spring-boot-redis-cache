package com.org.springboot.rediscache.service.impl;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.org.springboot.rediscache.pojo.Customer;
import com.org.springboot.rediscache.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@CacheConfig(cacheNames = {"Customer"})
public class CustomerServiceImpl implements CustomerService {

	@Override
	@Cacheable(key = "#id")
	public Customer getCustomerById(String id) {
		log.info("Getting customer information for id {}", id);
		return new Customer("User" + id, "contsct-us@jvadevjournal", id);

	}
}
