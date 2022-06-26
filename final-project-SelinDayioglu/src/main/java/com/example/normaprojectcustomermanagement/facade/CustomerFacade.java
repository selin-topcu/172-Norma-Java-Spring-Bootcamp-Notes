package com.example.normaprojectcustomermanagement.facade;

import com.example.normaprojectcustomermanagement.model.dto.CustomerDTO;
import org.springframework.http.ResponseEntity;

public interface CustomerFacade {
    ResponseEntity<CustomerDTO> getCustomers();
}
