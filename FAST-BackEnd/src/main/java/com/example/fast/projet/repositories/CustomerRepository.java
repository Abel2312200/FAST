package com.example.fast.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fast.projet.models.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    public Customer findByPersonEmail(String email);
    
}
