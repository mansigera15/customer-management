package com.customer.management.services;

import com.customer.management.models.Customer;
import com.customer.management.repositories.CustomerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
    //@Mock
    CustomerRepository customerRepository;
    //  @InjectMocks
    CustomerService customerService;

    //@Test
    public void getAllCustomersTest() {
        //  Mockito.when(customerRepository.findAll()).thenReturn(null);
        //List<Customer> allCustomers = customerService.getAllCustomers();

        //Assert.assertEquals(null,allCustomers);

    }
}

