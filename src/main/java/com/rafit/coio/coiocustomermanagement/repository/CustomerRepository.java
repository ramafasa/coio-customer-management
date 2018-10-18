package com.rafit.coio.coiocustomermanagement.repository;

import com.rafit.coio.coiocustomermanagement.model.Customer;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findBy_id(ObjectId _id);
}
