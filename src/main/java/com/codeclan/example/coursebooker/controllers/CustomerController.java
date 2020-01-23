package com.codeclan.example.coursebooker.controllers;


import com.codeclan.example.coursebooker.models.Customer;
import com.codeclan.example.coursebooker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/{courseName}/{courseTown}")
    public List<Customer> findCustomersByBookingsCourseNameIgnoreCaseAndBookingsCourseTownIgnoreCase(@PathVariable String courseName, @PathVariable  String courseTown){
        return customerRepository.findCustomersByBookingsCourseNameIgnoreCaseAndBookingsCourseTownIgnoreCase(courseName, courseTown);
    }
}
