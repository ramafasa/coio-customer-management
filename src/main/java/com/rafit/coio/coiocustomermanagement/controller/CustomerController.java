package com.rafit.coio.coiocustomermanagement.controller;

import com.rafit.coio.coiocustomermanagement.model.Customer;
import com.rafit.coio.coiocustomermanagement.repository.CustomerRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("id") ObjectId id) {
        return customerRepository.findBy_id(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        customer.set_id(ObjectId.get());
        customerRepository.save(customer);
        return customer;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
