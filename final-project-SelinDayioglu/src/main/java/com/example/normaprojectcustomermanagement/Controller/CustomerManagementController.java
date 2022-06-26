package com.example.normaprojectcustomermanagement.Controller;

import com.example.normaprojectcustomermanagement.model.enums.AccountType;
import com.example.normaprojectcustomermanagement.request.CreateCustomerRequest;
import com.example.normaprojectcustomermanagement.request.UpdateCustomerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/customers")
public class CustomerManagementController {

    @GetMapping
    public ResponseEntity<?> getAllCustomers(){
        return null;
    }

    @GetMapping(path="/{customerId}")
    public ResponseEntity<?> getCustomer(@PathVariable Integer customerId){
    return null;
    }

    @PostMapping(path="")
    public ResponseEntity<?> create(@RequestBody CreateCustomerRequest customerId){
        return null;
    }

    @PutMapping(path="")
    public ResponseEntity<?> update(@RequestBody UpdateCustomerRequest customerId){
        return null;
    }

    @DeleteMapping(path="/{customerId}")
    public ResponseEntity<?> update(@PathVariable  Integer customerId){
        return null;
    }

    @GetMapping(path="/{customerId}/balances")
    public ResponseEntity<?> getBalance(@PathVariable  Integer customerId){
        return null;
    }

}
