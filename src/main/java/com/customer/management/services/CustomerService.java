package com.customer.management.services;

import com.customer.management.models.Customer;

import java.util.List;

public interface CustomerService {
     List<Customer> getAllCustomers();
     Customer createCustomer(Customer customer);
     Customer getCustomerByCustomerId();
}

