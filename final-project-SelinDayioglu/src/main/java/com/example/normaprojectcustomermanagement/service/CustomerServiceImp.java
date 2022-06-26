package com.example.normaprojectcustomermanagement.service;

import com.example.normaprojectcustomermanagement.model.Customer;
import com.example.normaprojectcustomermanagement.repository.CustomerRepository;

import java.util.Collection;
import java.util.Optional;

public class CustomerServiceImp implements CustomerService{

    private final CustomerService customerService;

    public CustomerServiceImp(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public Optional<Collection<Customer>> findAllCustomers() {
        return Optional.empty();
    }
}
