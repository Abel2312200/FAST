package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Customer;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void saveCustomer() {

        Customer customer = Customer.builder()
                            .alreadyServed(false)
                            .dateCreated(new Date())
                            .operationType("withdraw")
                            .build();
                            
        customerRepository.save(customer);
    }
}
