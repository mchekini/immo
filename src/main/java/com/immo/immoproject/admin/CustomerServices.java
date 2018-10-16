package com.immo.immoproject.admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class CustomerServices {


    @Inject
    CustomerRepository repo;


    @GetMapping("/customer")
    public Customer listCustomer(String id) {


        return repo.findById(id).get();


    }
}
