package com.rafit.coio.coiocustomermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CoioCustomerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoioCustomerManagementApplication.class, args);
	}
}
