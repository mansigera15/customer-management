package com.customer.management.resources;

import com.customer.management.models.Customer;
import com.customer.management.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class.getName());

    @GetMapping
    public List<Customer> getCustomers() {
        LOGGER.debug(" getCustomers STARTED----");
        List<Customer> customers = customerService.getAllCustomers();

        //        List<Customer> customers = new ArrayList<>();
        //        customers.add(new Customer(100, "John", "Doe", LocalDate.now().minusYears(20)));
        LOGGER.debug("Total number of customers found {}", customers.size());
        return customers;
    }
}
