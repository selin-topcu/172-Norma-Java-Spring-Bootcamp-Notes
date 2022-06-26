package com.example.normaprojectcustomermanagement.service;

import com.example.normaprojectcustomermanagement.model.Customer;

import java.util.Collection;
import java.util.Optional;

public interface CustomerService {
    Optional<Collection<Customer>> findAllCustomers();
}
