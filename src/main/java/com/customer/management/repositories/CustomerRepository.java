package com.customer.management.repositories;

import com.customer.management.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    public Optional<Customer> findCustomerById(int id);
}
